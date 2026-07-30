package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r21 implements s21 {
    public final InputContentInfo m;

    public r21(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.m = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.s21
    public final ClipDescription a() {
        return this.m.getDescription();
    }

    @Override // defpackage.s21
    public final Object b() {
        return this.m;
    }

    @Override // defpackage.s21
    public final Uri d() {
        return this.m.getContentUri();
    }

    @Override // defpackage.s21
    public final void e() {
        this.m.requestPermission();
    }

    @Override // defpackage.s21
    public final Uri f() {
        return this.m.getLinkUri();
    }

    public r21(Object obj) {
        this.m = (InputContentInfo) obj;
    }
}
