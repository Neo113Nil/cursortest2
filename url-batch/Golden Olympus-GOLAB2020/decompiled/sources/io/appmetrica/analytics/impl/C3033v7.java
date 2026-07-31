package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3033v7 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2565d7 f39968a;

    /* renamed from: b, reason: collision with root package name */
    public final List f39969b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39970c;

    public C3033v7(InterfaceC2565d7 interfaceC2565d7, ArrayList arrayList, boolean z4) {
        this.f39968a = interfaceC2565d7;
        this.f39969b = arrayList;
        this.f39970c = z4;
    }

    public final String a(Context context, InterfaceC2955s7 interfaceC2955s7) {
        File parentFile;
        try {
            File a4 = this.f39968a.a(context, interfaceC2955s7.b());
            if (!a4.exists() && (parentFile = a4.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, interfaceC2955s7.a(), a4);
            }
            return a4.getPath();
        } catch (Throwable unused) {
            return interfaceC2955s7.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f39969b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File a4 = ((InterfaceC2565d7) it.next()).a(context, str);
            if (a4.exists()) {
                try {
                    if (this.f39970c) {
                        FileUtils.copyToNullable(a4, file);
                    } else {
                        FileUtils.move(a4, file);
                    }
                    String path = a4.getPath();
                    String path2 = file.getPath();
                    for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"-journal", "-shm", "-wal"})) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f39970c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
