package com.crrepa.band.my.device.contact;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivitySelectContactBinding;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.model.ContactModel;
import com.crrepa.band.my.model.db.Contact;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.ArrayList;
import java.util.List;
import me.yokeyword.indexablerv.d;

/* loaded from: classes2.dex */
public class SelectContactActivity extends BaseRequestPermissionActivity<ActivitySelectContactBinding> implements x0.b {
    public static final String SELECTED_CONTACT_NUMBER = "selected_contact_id";
    public static final String SELECT_CONTACT_LIST = "select_contact_list";
    private com.crrepa.band.my.device.contact.adapter.a contactAdapter;
    private MaterialDialog contactLoadingDialog;
    private final com.crrepa.band.my.device.contact.presenter.b presenter = new com.crrepa.band.my.device.contact.presenter.b();

    class a implements SearchView.OnQueryTextListener {
        a() {
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            if (SelectContactActivity.this.contactAdapter == null) {
                return false;
            }
            SelectContactActivity.this.contactAdapter.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    class b implements d.b {
        b() {
        }

        @Override // me.yokeyword.indexablerv.d.b
        public void onItemClick(View view, int i8, int i9, ContactModel contactModel) {
            SelectContactActivity.this.addContact(contactModel, SelectContactActivity.this.getAvatar((ImageView) view.findViewById(R.id.iv_avatar), (TextView) view.findViewById(R.id.tv_avatar)));
        }
    }

    class c implements PermissionDescriptionDialog.b {
        c() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("通讯录", true);
            h.needContactsPermissionSuccessWithPermissionCheck(SelectContactActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("通讯录", false);
            SelectContactActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContact(ContactModel contactModel, Bitmap bitmap) {
        this.presenter.addContact(contactModel, bitmap);
        this.contactAdapter.notifyDataSetChanged();
    }

    private void dismissProgressDialog() {
        MaterialDialog materialDialog = this.contactLoadingDialog;
        if (materialDialog != null) {
            materialDialog.dismiss();
            this.contactLoadingDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getAvatar(ImageView imageView, TextView textView) {
        if (imageView.getVisibility() != 8) {
            imageView.setDrawingCacheEnabled(true);
            Bitmap createBitmap = Bitmap.createBitmap(imageView.getDrawingCache());
            imageView.destroyDrawingCache();
            return createBitmap;
        }
        textView.setDrawingCacheEnabled(true);
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        Bitmap createBitmap2 = Bitmap.createBitmap(textView.getDrawingCache());
        textView.destroyDrawingCache();
        return createBitmap2;
    }

    public static Intent getCallingIntent(Context context, ArrayList<Contact> arrayList, String str) {
        Intent intent = new Intent(context, (Class<?>) SelectContactActivity.class);
        intent.putParcelableArrayListExtra(SELECT_CONTACT_LIST, arrayList);
        intent.putExtra(SELECTED_CONTACT_NUMBER, str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        this.presenter.saveSelectedContact();
    }

    private void showProgressDialog() {
        this.contactLoadingDialog = new MaterialDialog.e(this).progress(true, 100).progressIndeterminateStyle(false).content(R.string.load_contact_hint).show();
    }

    private void showReadContactsPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_contacts).setTitle(R.string.permission_contacts_title).setContent(R.string.permission_contacts_content).setOnClickListener(new c()).build(this).show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        renderSeleceContactCount(0);
        requestContactsPermission();
        ((ActivitySelectContactBinding) this.binding).searchview.setOnQueryTextListener(new a());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivitySelectContactBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.contact.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectContactActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivitySelectContactBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.contact.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectContactActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    void needContactsPermissionSuccess() {
        com.crrepa.band.my.home.guidance.c.systemPermission("通讯录", true);
        com.orhanobut.logger.f.d("needContactsPermissionSuccess");
        showProgressDialog();
        String stringExtra = getIntent().getStringExtra(SELECTED_CONTACT_NUMBER);
        this.presenter.getAllContact(this, getIntent().getParcelableArrayListExtra(SELECT_CONTACT_LIST), stringExtra);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, @Nullable Intent intent) {
        super.onActivityResult(i8, i9, intent);
        com.orhanobut.logger.f.d("onActivityResult: " + i8);
        if (i8 == 10) {
            if (q7.b.hasSelfPermissions(this, "android.permission.READ_CONTACTS")) {
                needContactsPermissionSuccess();
            } else {
                finish();
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        dismissProgressDialog();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        com.orhanobut.logger.f.d("onRequestPermissionsResult");
        h.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "快捷通讯_添加");
    }

    @Override // x0.b
    public void renderContactList(List<ContactModel> list) {
        dismissProgressDialog();
        this.contactAdapter = new com.crrepa.band.my.device.contact.adapter.a(this);
        ((ActivitySelectContactBinding) this.binding).contactIndexableLayout.setLayoutManager(new LinearLayoutManager(this));
        ((ActivitySelectContactBinding) this.binding).contactIndexableLayout.setCompareMode(0);
        ((ActivitySelectContactBinding) this.binding).contactIndexableLayout.setAdapter(this.contactAdapter);
        this.contactAdapter.setDatas(list);
        this.contactAdapter.setOnItemContentClickListener(new b());
    }

    @Override // x0.b
    public void renderMaxSelectContactCountHint(int i8) {
        r0.showLong(this, getString(R.string.max_contact_hint, Integer.valueOf(i8)));
    }

    @Override // x0.b
    public void renderSeleceContactCount(int i8) {
        ((ActivitySelectContactBinding) this.binding).tvDone.setText(getString(R.string.device_quick_contact_done, Integer.valueOf(i8)));
    }

    @Override // x0.b
    public void renderSelectedContactList(ArrayList<Contact> arrayList, String str) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra(SELECT_CONTACT_LIST, arrayList);
        intent.putExtra(SELECTED_CONTACT_NUMBER, str);
        setResult(-1, intent);
        finish();
    }

    public void requestContactsPermission() {
        if (q7.b.hasSelfPermissions(this, "android.permission.READ_CONTACTS")) {
            needContactsPermissionSuccess();
        } else {
            showReadContactsPermissionDialog();
        }
    }

    void showDeniedForContacts() {
        com.crrepa.band.my.home.guidance.c.systemPermission("通讯录", false);
        com.orhanobut.logger.f.d("showDeniedForContacts");
        r0.showLong(this, getString(R.string.permission_contacts_denied));
        finish();
    }

    void showNeverAskForContacts() {
        com.orhanobut.logger.f.d("showNeverAskForContacts");
        c0.jumpAppDetailsSetting(this);
    }
}
