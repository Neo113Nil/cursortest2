package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Z6 {

    /* renamed from: a, reason: collision with root package name */
    public final I6 f11346a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11347b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11348c;

    public Z6(I6 i6, ArrayList arrayList, boolean z) {
        this.f11346a = i6;
        this.f11347b = arrayList;
        this.f11348c = z;
    }

    public final String a(Context context, X6 x6) {
        File parentFile;
        try {
            File a3 = this.f11346a.a(context, x6.b());
            if (!a3.exists() && (parentFile = a3.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, x6.a(), a3);
            }
            return a3.getPath();
        } catch (Throwable unused) {
            return x6.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f11347b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File a3 = ((I6) it.next()).a(context, str);
                if (a3.exists()) {
                    try {
                        if (this.f11348c) {
                            FileUtils.copyToNullable(a3, file);
                        } else {
                            FileUtils.move(a3, file);
                        }
                        String path = a3.getPath();
                        String path2 = file.getPath();
                        for (String str2 : d3.j.W("-journal", "-shm", "-wal")) {
                            File file2 = new File(path + str2);
                            File file3 = new File(path2 + str2);
                            if (this.f11348c) {
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
