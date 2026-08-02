package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537h7 {

    /* renamed from: a, reason: collision with root package name */
    public final P6 f7435a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7437c;

    public C0537h7(P6 p6, ArrayList arrayList, boolean z) {
        this.f7435a = p6;
        this.f7436b = arrayList;
        this.f7437c = z;
    }

    public final String a(Context context, InterfaceC0459e7 interfaceC0459e7) {
        File parentFile;
        try {
            File a3 = this.f7435a.a(context, interfaceC0459e7.b());
            if (!a3.exists() && (parentFile = a3.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, interfaceC0459e7.a(), a3);
            }
            return a3.getPath();
        } catch (Throwable unused) {
            return interfaceC0459e7.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f7436b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File a3 = ((P6) it.next()).a(context, str);
                if (a3.exists()) {
                    try {
                        if (this.f7437c) {
                            FileUtils.copyToNullable(a3, file);
                        } else {
                            FileUtils.move(a3, file);
                        }
                        String path = a3.getPath();
                        String path2 = file.getPath();
                        for (String str2 : c2.f.L("-journal", "-shm", "-wal")) {
                            File file2 = new File(path + str2);
                            File file3 = new File(path2 + str2);
                            if (this.f7437c) {
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
}
