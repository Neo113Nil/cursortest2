package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import f3.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ig0 extends f3.c {

    /* renamed from: a, reason: collision with root package name */
    private final h60 f6640a;

    /* renamed from: c, reason: collision with root package name */
    private final hg0 f6642c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f6643d;

    /* renamed from: b, reason: collision with root package name */
    private final List<c.b> f6641b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<Object> f6644e = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6))|(3:19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23)))|36|37|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        com.google.android.gms.internal.ads.io0.e("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097 A[Catch: RemoteException -> 0x00a4, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00a4, blocks: (B:42:0x008f, B:44:0x0097), top: B:41:0x008f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ig0(h60 h60Var) {
        hg0 hg0Var;
        n40 j7;
        this.f6640a = h60Var;
        gg0 gg0Var = null;
        try {
            List y6 = h60Var.y();
            if (y6 != null) {
                for (Object obj : y6) {
                    n40 s62 = obj instanceof IBinder ? m40.s6((IBinder) obj) : null;
                    if (s62 != null) {
                        this.f6641b.add(new hg0(s62));
                    }
                }
            }
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
        try {
            List x6 = this.f6640a.x();
            if (x6 != null) {
                for (Object obj2 : x6) {
                    my s63 = obj2 instanceof IBinder ? ly.s6((IBinder) obj2) : null;
                    if (s63 != null) {
                        this.f6644e.add(new ny(s63));
                    }
                }
            }
        } catch (RemoteException e8) {
            io0.e("", e8);
        }
        try {
            j7 = this.f6640a.j();
        } catch (RemoteException e9) {
            io0.e("", e9);
        }
        if (j7 != null) {
            hg0Var = new hg0(j7);
            this.f6642c = hg0Var;
            if (this.f6640a.h() != null) {
                gg0Var = new gg0(this.f6640a.h());
            }
            this.f6643d = gg0Var;
        }
        hg0Var = null;
        this.f6642c = hg0Var;
        if (this.f6640a.h() != null) {
        }
        this.f6643d = gg0Var;
    }

    @Override // f3.c
    public final r2.v a() {
        zy zyVar;
        try {
            zyVar = this.f6640a.e();
        } catch (RemoteException e7) {
            io0.e("", e7);
            zyVar = null;
        }
        return r2.v.d(zyVar);
    }

    @Override // f3.c
    public final void b(r2.r rVar) {
        try {
            this.f6640a.m2(new m00(rVar));
        } catch (RemoteException e7) {
            io0.e("Failed to setOnPaidEventListener", e7);
        }
    }

    @Override // f3.c
    protected final /* bridge */ /* synthetic */ Object c() {
        try {
            return this.f6640a.o();
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }
}
