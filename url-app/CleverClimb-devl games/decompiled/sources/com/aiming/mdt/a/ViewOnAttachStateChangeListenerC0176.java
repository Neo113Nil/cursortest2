package com.aiming.mdt.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.aiming.mdt.a.C0147;
import com.aiming.mdt.adt.C0239;
import com.aiming.mdt.adt.InterfaceC0231;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0282;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.aiming.mdt.a.ʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnAttachStateChangeListenerC0176 extends C0239 implements View.OnAttachStateChangeListener, View.OnClickListener {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private AdBean f604;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private boolean f605;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private C0147 f606;

    /* renamed from: ʽ, reason: contains not printable characters */
    private InterfaceC0085 f607;

    ViewOnAttachStateChangeListenerC0176(Context context, String str) {
        super(context, str, 1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f604 == null) {
            return;
        }
        C0128.m478(this.f755, this.f604);
        C0042.m99(this.f755, this.f753, this.f604);
        m857();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f605 || this.f604 == null) {
            return;
        }
        this.f752.m845();
        C0128.m477(this.f755, this.f753, this.f604, false);
        this.f605 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f605 = false;
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʽ */
    protected final void mo11() {
        super.mo11();
        this.f607 = null;
        this.f606 = null;
        this.f604 = null;
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʾ */
    protected final void mo13() {
        super.mo13();
        if (this.f607 == null) {
            return;
        }
        this.f607.onAdReady(this.f606);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:3:0x0003, B:5:0x0009, B:7:0x0016, B:10:0x001d, B:14:0x002e, B:17:0x0034, B:20:0x0049, B:22:0x0041, B:23:0x0028), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:3:0x0003, B:5:0x0009, B:7:0x0016, B:10:0x001d, B:14:0x002e, B:17:0x0034, B:20:0x0049, B:22:0x0041, B:23:0x0028), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028 A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:3:0x0003, B:5:0x0009, B:7:0x0016, B:10:0x001d, B:14:0x002e, B:17:0x0034, B:20:0x0049, B:22:0x0041, B:23:0x0028), top: B:2:0x0003 }] */
    @Override // com.aiming.mdt.adt.C0239, com.aiming.mdt.adt.C0226.InterfaceC0227
    /* renamed from: ʽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo15(AdBean adBean) {
        FileInputStream fileInputStream;
        Bitmap decodeStream;
        super.mo15(adBean);
        try {
            this.f604 = adBean;
            if (this.f607 == null) {
                return;
            }
            Bitmap bitmap = null;
            File m530 = C0139.m530(this.f755, adBean.getMainimgUrl(), null);
            if (m530 != null && m530.exists()) {
                fileInputStream = new FileInputStream(m530);
                decodeStream = fileInputStream != null ? null : BitmapFactory.decodeStream(fileInputStream);
                if (decodeStream != null) {
                    m855("Ad resource is empty");
                    return;
                }
                File m5302 = C0139.m530(this.f755, adBean.getIconUrl(), null);
                if (m5302 != null) {
                    bitmap = BitmapFactory.decodeFile(m5302.getAbsolutePath());
                }
                C0147.C0148 c0148 = new C0147.C0148();
                c0148.m582(adBean.getTitle()).m580(adBean.getDescription()).m579("install").m578(decodeStream).m581(bitmap);
                this.f606 = new C0147(c0148, (byte) 0);
                m856();
                return;
            }
            fileInputStream = null;
            if (fileInputStream != null) {
            }
            if (decodeStream != null) {
            }
        } catch (Exception e) {
            m855(e.getMessage());
            C0076.m232().m236(e);
            C0282.m972("Adt-Native", e);
        }
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʽ */
    protected final void mo16(InterfaceC0231 interfaceC0231) {
        super.mo16(interfaceC0231);
        this.f607 = (InterfaceC0085) interfaceC0231;
    }
}
