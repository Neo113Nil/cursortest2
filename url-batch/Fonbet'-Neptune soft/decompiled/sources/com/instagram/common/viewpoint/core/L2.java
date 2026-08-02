package com.instagram.common.viewpoint.core;

import java.io.File;
import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public final class L2 implements Comparator<File> {
    public L2() {
    }

    private int A00(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compare(File file, File file2) {
        return A00(file.lastModified(), file2.lastModified());
    }
}
