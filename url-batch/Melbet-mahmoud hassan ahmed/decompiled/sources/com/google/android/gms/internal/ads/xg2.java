package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Debug;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class xg2 implements ij2<yg2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f14200a;

    public xg2(dc3 dc3Var) {
        this.f14200a = dc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<yg2> a() {
        return this.f14200a.E(new Callable() { // from class: com.google.android.gms.internal.ads.wg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                if (((Boolean) sw.c().b(m10.E)).booleanValue()) {
                    Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                    Debug.getMemoryInfo(memoryInfo);
                    bundle.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", y2.t.p().a());
                return new yg2(bundle);
            }
        });
    }
}
