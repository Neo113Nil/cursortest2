package com.crrepa.band.my.device.ecard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityEcardEditBinding;
import com.crrepa.band.my.model.db.ECard;
import com.crrepa.band.my.model.db.ECardConfig;
import com.crrepa.band.my.model.db.proxy.ECardConfigDaoProxy;
import com.crrepa.band.my.model.db.proxy.ECardDaoProxy;
import com.crrepa.ble.conn.bean.CRPElectronicCardInfo;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.v0;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public class ECardEditActivity extends BaseVBActivity<ActivityEcardEditBinding> {
    private static final String ECARD_ID = "ecard_id";
    private static final int REQUEST_GALLERY = 101;
    private static final int TITLE_LIMIT = 40;
    private ECardDaoProxy daoProxy = new ECardDaoProxy();
    private long ecardId;
    private String ecardUrl;
    private int urlBytesLimit;

    class a implements Runnable {
        final /* synthetic */ ECard val$eCard;

        a(ECard eCard) {
            this.val$eCard = eCard;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ActivityEcardEditBinding) ((BaseVBActivity) ECardEditActivity.this).binding).ivEcardQrcode.setImageBitmap(e1.a.createQRCode(this.val$eCard.getUrl(), ((ActivityEcardEditBinding) ((BaseVBActivity) ECardEditActivity.this).binding).ivEcardQrcode.getHeight()));
        }
    }

    class b implements MaterialDialog.g {
        String lastTitle = "";

        b() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.g
        public void onInput(@NonNull MaterialDialog materialDialog, CharSequence charSequence) {
            String charSequence2 = charSequence.toString();
            if (charSequence2.getBytes(StandardCharsets.UTF_8).length < 40) {
                this.lastTitle = charSequence2;
                return;
            }
            r0.showShort("文字过长");
            if (materialDialog.getInputEditText() == null) {
                return;
            }
            materialDialog.getInputEditText().setText(this.lastTitle);
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Bitmap bitmap) {
            ((ActivityEcardEditBinding) ((BaseVBActivity) ECardEditActivity.this).binding).ivEcardQrcode.setImageBitmap(bitmap);
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            ECardEditActivity eCardEditActivity = ECardEditActivity.this;
            r0.showShort(eCardEditActivity, eCardEditActivity.getString(R.string.qr_code_null_hint));
        }
    }

    class e implements Function {
        e() {
        }

        @Override // io.reactivex.functions.Function
        public Bitmap apply(String str) {
            ECardEditActivity.this.ecardUrl = str;
            return e1.a.createQRCode(str, ((ActivityEcardEditBinding) ((BaseVBActivity) ECardEditActivity.this).binding).ivEcardQrcode.getHeight());
        }
    }

    class f implements ObservableOnSubscribe {
        final /* synthetic */ Intent val$data;

        f(Intent intent) {
            this.val$data = intent;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<String> observableEmitter) {
            ECardEditActivity eCardEditActivity = ECardEditActivity.this;
            String parseQRCode = e1.a.parseQRCode(eCardEditActivity.getBitmapOf29(eCardEditActivity, this.val$data.getData()));
            com.orhanobut.logger.f.d("url: " + parseQRCode);
            if (TextUtils.isEmpty(parseQRCode) || parseQRCode.getBytes(StandardCharsets.UTF_8).length >= ECardEditActivity.this.urlBytesLimit) {
                observableEmitter.onError(new Throwable("url is null!"));
            } else {
                observableEmitter.onNext(parseQRCode);
                observableEmitter.onComplete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getBitmapOf29(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return com.moyoung.dafit.module.common.utils.g.rotaingBitmap(BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri)), w1.f.readExifOrientation(new ExifInterface(context.getContentResolver().openInputStream(uri)).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1)));
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) ECardEditActivity.class);
    }

    private int getUrlBytesLimit() {
        ECardConfig eCardConfig = new ECardConfigDaoProxy().get(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (eCardConfig == null) {
            return 0;
        }
        return eCardConfig.getUrlLimit().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        startActivityForResult(w1.g.selectImageIntent(), 101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        onSaveClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$3(View view) {
        onECardTitleClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onECardTitleClicked$4(MaterialDialog materialDialog, DialogAction dialogAction) {
        if (materialDialog.getInputEditText() == null) {
            return;
        }
        String obj = materialDialog.getInputEditText().getText().toString();
        if (x0.isNotEmpty(obj)) {
            setECardTitle(obj);
        }
    }

    @SuppressLint({"CheckResult"})
    private void parseImage(Intent intent) {
        String imagePath = v0.getImagePath(this, intent);
        com.orhanobut.logger.f.d("path: " + imagePath);
        if (TextUtils.isEmpty(imagePath)) {
            r0.showShort(this, getString(R.string.cannot_retrieve_selected_image));
        } else {
            Observable.create(new f(intent)).map(new e()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c(), new d());
        }
    }

    private void setECardTitle(String str) {
        if (str.getBytes(StandardCharsets.UTF_8).length < 40) {
            ((ActivityEcardEditBinding) this.binding).tvEcardTitle.setText(str);
        } else {
            r0.showShort(this, R.string.action_button_add_fail_content);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        ECard eCard;
        super.initBinding();
        this.urlBytesLimit = getUrlBytesLimit();
        long longExtra = getIntent().getLongExtra(ECARD_ID, -1L);
        this.ecardId = longExtra;
        if (0 > longExtra || (eCard = this.daoProxy.get(longExtra)) == null) {
            return;
        }
        this.ecardUrl = eCard.getUrl();
        ((ActivityEcardEditBinding) this.binding).tvEcardTitle.setText(eCard.getTitle());
        ((ActivityEcardEditBinding) this.binding).ivEcardQrcode.post(new a(eCard));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityEcardEditBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ecard.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ECardEditActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityEcardEditBinding) this.binding).llEcardQrcode.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ecard.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ECardEditActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityEcardEditBinding) this.binding).tvSave.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ecard.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ECardEditActivity.this.lambda$initOnClickListener$2(view);
            }
        });
        ((ActivityEcardEditBinding) this.binding).llEcardTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ecard.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ECardEditActivity.this.lambda$initOnClickListener$3(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, @Nullable Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1 && i8 == 101) {
            parseImage(intent);
        }
    }

    public void onECardTitleClicked() {
        new MaterialDialog.e(this).title(R.string.qr_code_title).input(getString(R.string.qr_code_title_hint), ((ActivityEcardEditBinding) this.binding).tvEcardTitle.getText(), new b()).alwaysCallInputCallback().onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.ecard.e
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                ECardEditActivity.this.lambda$onECardTitleClicked$4(materialDialog, dialogAction);
            }
        }).build().show();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "电子名片_新增");
    }

    public void onSaveClicked() {
        ECard eCard;
        CRPElectronicCardInfo cRPElectronicCardInfo;
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            r0.showLong(this, getString(R.string.band_setting_send_fail));
            return;
        }
        String charSequence = ((ActivityEcardEditBinding) this.binding).tvEcardTitle.getText().toString();
        if (TextUtils.isEmpty(this.ecardUrl) || TextUtils.isEmpty(charSequence)) {
            return;
        }
        long j8 = this.ecardId;
        if (0 <= j8) {
            eCard = this.daoProxy.get(j8);
            cRPElectronicCardInfo = new CRPElectronicCardInfo((int) this.ecardId, charSequence, this.ecardUrl);
        } else {
            eCard = null;
            cRPElectronicCardInfo = null;
        }
        if (cRPElectronicCardInfo == null) {
            long nextECardId = this.daoProxy.getNextECardId();
            if (nextECardId < 0) {
                finish();
            }
            CRPElectronicCardInfo cRPElectronicCardInfo2 = new CRPElectronicCardInfo((int) nextECardId, charSequence, this.ecardUrl);
            int nextECardIndex = this.daoProxy.getNextECardIndex();
            ECard eCard2 = new ECard();
            eCard2.setId(Long.valueOf(nextECardId));
            eCard2.setIndex(Integer.valueOf(nextECardIndex));
            cRPElectronicCardInfo = cRPElectronicCardInfo2;
            eCard = eCard2;
        }
        if (i4.getInstance().sendECard(cRPElectronicCardInfo)) {
            eCard.setTitle(charSequence);
            eCard.setUrl(this.ecardUrl);
            this.daoProxy.insert(eCard);
        }
        setResult(-1);
        finish();
    }

    public static Intent getCallingIntent(Context context, long j8) {
        Intent intent = new Intent(context, (Class<?>) ECardEditActivity.class);
        intent.putExtra(ECARD_ID, j8);
        return intent;
    }
}
