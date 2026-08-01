package p0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f3009a;

    public f(Object obj) {
        this.f3009a = (InputContentInfo) obj;
    }

    @Override // p0.g
    public final void a() {
        this.f3009a.requestPermission();
    }

    @Override // p0.g
    public final Uri b() {
        return this.f3009a.getLinkUri();
    }

    @Override // p0.g
    public final ClipDescription c() {
        return this.f3009a.getDescription();
    }

    @Override // p0.g
    public final Object d() {
        return this.f3009a;
    }

    @Override // p0.g
    public final Uri e() {
        return this.f3009a.getContentUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3009a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
