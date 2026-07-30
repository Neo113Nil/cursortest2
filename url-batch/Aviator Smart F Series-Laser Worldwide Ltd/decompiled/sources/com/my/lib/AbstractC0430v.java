package com.my.lib;

import com.my.lib.AbstractC0430v;
import java.io.File;
import java.io.FileFilter;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* renamed from: com.my.lib.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0430v {
    public static void a(String folderPath) {
        List<File> drop;
        kotlin.jvm.internal.s.checkNotNullParameter(folderPath, "folderPath");
        File file = new File(folderPath);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles(new FileFilter() { // from class: i5.c1
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return AbstractC0430v.a(file2);
                }
            });
            if (listFiles == null) {
                listFiles = new File[0];
            }
            if (listFiles.length == 0) {
                return;
            }
            B.a("Files size: " + listFiles.length);
            drop = CollectionsKt___CollectionsKt.drop(ArraysKt___ArraysKt.sortedWith(listFiles, new C0429u()), 6);
            for (File file2 : drop) {
                file2.delete();
                B.a("delete file: " + file2.getName());
            }
        }
    }

    public static final boolean a(File file) {
        return file.isFile();
    }
}
