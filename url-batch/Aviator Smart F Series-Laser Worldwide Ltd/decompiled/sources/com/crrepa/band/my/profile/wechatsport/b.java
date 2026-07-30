package com.crrepa.band.my.profile.wechatsport;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.net.WechatSportQrCodeEntity;
import com.moyoung.dafit.module.common.utils.r;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes2.dex */
public class b implements com.moyoung.dafit.module.common.baseui.f {
    private Disposable subscribe;
    private com.crrepa.band.my.profile.wechatsport.c wechatSportView;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Bitmap bitmap) {
            if (bitmap != null) {
                b.this.showQrCode(bitmap);
            } else {
                b.this.showNetError(R.string.net_disonnected);
            }
        }
    }

    /* renamed from: com.crrepa.band.my.profile.wechatsport.b$b, reason: collision with other inner class name */
    class C0210b implements Consumer {
        C0210b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            b.this.showNetError(R.string.net_disonnected);
        }
    }

    class c implements Function {
        final /* synthetic */ Context val$context;
        final /* synthetic */ int val$height;

        c(Context context, int i8) {
            this.val$context = context;
            this.val$height = i8;
        }

        @Override // io.reactivex.functions.Function
        public Bitmap apply(@NonNull WechatSportQrCodeEntity wechatSportQrCodeEntity) {
            if (wechatSportQrCodeEntity.getCode() != 0) {
                return null;
            }
            return b5.a.createQRCode(wechatSportQrCodeEntity.getQrticket(), this.val$height, BitmapFactory.decodeResource(this.val$context.getResources(), R$drawable.ic_app_logo));
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Boolean bool) {
            if (bool.booleanValue()) {
                b.this.saveSuccess();
            } else {
                b.this.saveFailed();
            }
        }
    }

    class e implements Consumer {
        e() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            b.this.saveFailed();
        }
    }

    class f implements Function {
        f() {
        }

        @Override // io.reactivex.functions.Function
        public Boolean apply(Bitmap bitmap) {
            return Boolean.valueOf(r.save2Gallery(com.moyoung.dafit.module.common.utils.d.get(), bitmap) != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveFailed() {
        this.wechatSportView.saveFail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveSuccess() {
        this.wechatSportView.saveSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNetError(int i8) {
        this.wechatSportView.showNetError(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showQrCode(Bitmap bitmap) {
        this.wechatSportView.renderWechatSportQrCode(bitmap);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.wechatSportView = null;
        Disposable disposable = this.subscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.subscribe.dispose();
    }

    public void getQrCode(Context context, int i8) {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null) {
            return;
        }
        this.subscribe = com.crrepa.band.my.profile.b.getInstance().getApiStores().getWechatSportQrCode(connectBand.getWechatPid(), BandInfoManager.getAddress()).map(new c(context, i8)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(), new C0210b());
    }

    public void getQrCodeView() {
        if (TextUtils.isEmpty(BandInfoManager.getAddress())) {
            this.wechatSportView.showNotBoundBand();
        } else {
            this.wechatSportView.showQrCode();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveQrCode(Bitmap bitmap) {
        Observable.just(bitmap).map(new f()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(), new e());
    }

    public void setView(com.crrepa.band.my.profile.wechatsport.c cVar) {
        this.wechatSportView = cVar;
    }
}
