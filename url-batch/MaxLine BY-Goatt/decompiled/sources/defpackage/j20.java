package defpackage;

import android.content.ClipData;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j20 implements k20, m20 {
    public final /* synthetic */ int a;
    public final Object b;

    public j20() {
        this.a = 2;
        this.b = ij2.j(Boolean.FALSE);
    }

    @Override // defpackage.m20
    public ClipData a() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.m20
    public int b() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.k20
    public n20 build() {
        return new n20(new j20(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.m20
    public ContentInfo c() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.k20
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.m20
    public int e() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.k20
    public void f(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    public void g(t7 t7Var, ei2 ei2Var, CoroutineContext coroutineContext, Consumer consumer) {
        eo1 eo1Var = new eo1(new af2[16]);
        yj1.L(ei2Var.a(), 0, new ze2(1, 8, eo1.class, eo1Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(eo1Var.m, 0, eo1Var.o, new ax(0, new Function1[]{gs1.B, gs1.C}));
        int i = eo1Var.o;
        af2 af2Var = (af2) (i == 0 ? null : eo1Var.m[i - 1]);
        if (af2Var == null) {
            return;
        }
        u31 u31Var = af2Var.c;
        lz lzVar = new lz(af2Var.a, u31Var, j8.b(coroutineContext), this, t7Var);
        ks1 ks1Var = af2Var.d;
        long j = (u31Var.b & 4294967295L) | (u31Var.a << 32);
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(t7Var, bd3.H(ll3.U(yk3.D(ks1Var).M(ks1Var, true))), new Point((int) (j >> 32), (int) (j & 4294967295L)), lzVar);
        scrollCaptureTarget.setScrollBounds(bd3.H(u31Var));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // defpackage.k20
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public j20(ContentInfo contentInfo) {
        this.a = 1;
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public j20(ClipData clipData, int i) {
        this.a = 0;
        this.b = i20.b(clipData, i);
    }
}
