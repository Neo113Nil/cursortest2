package com.crrepa.band.my.profile.userinfo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.text.TextUtilsCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogUserInfoChooceBinding;
import com.crrepa.band.my.model.UserInfoModel;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class h extends Dialog implements w3.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    DialogUserInfoChooceBinding binding;
    private UserInfoModel.InfoType infoType;
    private a onDoneClickListener;
    private com.crrepa.band.my.profile.userinfo.presenter.a presenter;
    private int unitSystem;

    public interface a {
        void onDone(UserInfoModel.InfoType infoType, int i8, int i9);
    }

    public h(@NonNull Context context, UserInfoModel.InfoType infoType) {
        super(context, R.style.UserInfoChooceDialog);
        this.presenter = new com.crrepa.band.my.profile.userinfo.presenter.a();
        this.unitSystem = BandUnitSystemProvider.getUnitSystem();
        this.infoType = infoType;
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        attributes.height = (int) (displayMetrics.heightPixels * 0.4d);
        attributes.width = displayMetrics.widthPixels;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    private void initView() {
        DialogUserInfoChooceBinding inflate = DialogUserInfoChooceBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.userinfo.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.this.lambda$initView$0(view);
            }
        });
        this.binding.tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.userinfo.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.this.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        int currentItemPosition = this.binding.wpUserInfo.getCurrentItemPosition();
        com.orhanobut.logger.f.d("user info position: " + currentItemPosition);
        a aVar = this.onDoneClickListener;
        if (aVar != null) {
            aVar.onDone(this.infoType, currentItemPosition, this.unitSystem);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.setView(this);
        initView();
        initLayout();
        this.presenter.getUserInfoList(getContext(), this.infoType, this.unitSystem);
        this.presenter.getUserInfoUnitList(getContext(), this.infoType, this.unitSystem);
    }

    @Override // w3.a
    public void renderUserInfo(int i8) {
        com.orhanobut.logger.f.d("renderUserInfo: " + i8);
        this.binding.wpUserInfo.setSelectedItemPosition(i8);
    }

    @Override // w3.a
    public void renderUserInfoList(List list) {
        this.binding.wpUserInfo.setData(list);
    }

    @Override // w3.a
    public void renderUserInfoUnitList(List list) {
        this.binding.wpUserInfoUnit.setVisibility(0);
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            this.binding.wpUserInfo.setItemAlign(1);
            this.binding.wpUserInfoUnit.setItemAlign(2);
        } else {
            this.binding.wpUserInfo.setItemAlign(2);
            this.binding.wpUserInfoUnit.setItemAlign(1);
        }
        this.binding.wpUserInfoUnit.setData(list);
    }

    public h setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
        return this;
    }
}
