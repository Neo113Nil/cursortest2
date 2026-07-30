package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.util.c;

/* loaded from: classes4.dex */
public class b implements c.d {
    @Override // com.liulishuo.filedownloader.util.c.d
    public int generateId(String str, String str2, boolean z7) {
        return z7 ? com.liulishuo.filedownloader.util.f.md5(com.liulishuo.filedownloader.util.f.formatString("%sp%s@dir", str, str2)).hashCode() : com.liulishuo.filedownloader.util.f.md5(com.liulishuo.filedownloader.util.f.formatString("%sp%s", str, str2)).hashCode();
    }

    @Override // com.liulishuo.filedownloader.util.c.d
    public int transOldId(int i8, String str, String str2, boolean z7) {
        return generateId(str, str2, z7);
    }
}
