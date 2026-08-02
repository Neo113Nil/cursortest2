package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wz implements xa {
    private final ContentInfo a;

    public wz(ContentInfo contentInfo) {
        tw.F(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.xa
    public final int a() {
        int flags;
        flags = this.a.getFlags();
        return flags;
    }

    @Override // defpackage.xa
    public final int b() {
        int source;
        source = this.a.getSource();
        return source;
    }

    @Override // defpackage.xa
    public final ClipData c() {
        ClipData clip;
        clip = this.a.getClip();
        return clip;
    }

    @Override // defpackage.xa
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
