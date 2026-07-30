package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class e71 extends gl0 {
    @Override // defpackage.gl0
    public final ol2 a(qz1 qz1Var) {
        qz1Var.getClass();
        File file = qz1Var.toFile();
        Logger logger = gu1.a;
        return new pj(new FileOutputStream(file, true), new rx2());
    }

    @Override // defpackage.gl0
    public void b(qz1 qz1Var, qz1 qz1Var2) {
        qz1Var.getClass();
        qz1Var2.getClass();
        if (qz1Var.toFile().renameTo(qz1Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + qz1Var + " to " + qz1Var2);
    }

    @Override // defpackage.gl0
    public final void c(qz1 qz1Var) {
        if (qz1Var.toFile().mkdir()) {
            return;
        }
        yk0 i = i(qz1Var);
        if (i == null || !i.b) {
            ch2.j(qz1Var, "failed to create directory: ");
        }
    }

    @Override // defpackage.gl0
    public final void d(qz1 qz1Var) {
        qz1Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = qz1Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        ch2.j(qz1Var, "failed to delete ");
    }

    @Override // defpackage.gl0
    public final List g(qz1 qz1Var) {
        File file = qz1Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                ch2.j(qz1Var, "failed to list ");
                return null;
            }
            ey.n(qz1Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(qz1Var.d(str));
        }
        uv.m(arrayList);
        return arrayList;
    }

    @Override // defpackage.gl0
    public yk0 i(qz1 qz1Var) {
        qz1Var.getClass();
        File file = qz1Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new yk0(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // defpackage.gl0
    public final d71 j(qz1 qz1Var) {
        return new d71(new RandomAccessFile(qz1Var.toFile(), "r"));
    }

    @Override // defpackage.gl0
    public final ol2 k(qz1 qz1Var) {
        qz1Var.getClass();
        File file = qz1Var.toFile();
        Logger logger = gu1.a;
        return new pj(new FileOutputStream(file, false), new rx2());
    }

    @Override // defpackage.gl0
    public final pn2 l(qz1 qz1Var) {
        qz1Var.getClass();
        File file = qz1Var.toFile();
        Logger logger = gu1.a;
        return new qj(new FileInputStream(file), rx2.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
