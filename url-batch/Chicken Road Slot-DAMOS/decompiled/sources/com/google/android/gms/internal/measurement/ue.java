package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class ue implements f8.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2.b1 f2857b;

    public /* synthetic */ ue(c2.b1 b1Var, int i3) {
        this.f2856a = i3;
        this.f2857b = b1Var;
    }

    @Override // f8.z
    public final ListenableFuture apply(Object obj) {
        ListenableFuture listenableFuture;
        switch (this.f2856a) {
            case 0:
                c2.b1 b1Var = this.f2857b;
                synchronized (b1Var.f1497i) {
                    listenableFuture = (ListenableFuture) b1Var.f1498k;
                }
                return listenableFuture;
            case 1:
                c2.b1 b1Var2 = this.f2857b;
                return f8.l0.d(b1Var2.j((Uri) f8.l0.b((ListenableFuture) b1Var2.f1492c)));
            case 2:
                c2.b1 b1Var3 = this.f2857b;
                b1Var3.k((Uri) f8.l0.b((ListenableFuture) b1Var3.f1492c), obj);
                return f8.o0.f4157e;
            default:
                c2.b1 b1Var4 = this.f2857b;
                Uri uri = (Uri) obj;
                Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    zd zdVar = (zd) b1Var4.f1495f;
                    xd b10 = zdVar.b(build);
                    if (b10.f2985a.b(b10.f2988d)) {
                        xd b11 = zdVar.b(build);
                        xd b12 = zdVar.b(uri);
                        oe oeVar = b11.f2985a;
                        if (oeVar != b12.f2985a) {
                            throw new androidx.datastore.preferences.protobuf.k("Cannot rename file across backends");
                        }
                        oeVar.e(b11.f2988d, b12.f2988d);
                    }
                    return f8.o0.f4157e;
                } catch (IOException e2) {
                    return f8.l0.c(e2);
                }
        }
    }
}
