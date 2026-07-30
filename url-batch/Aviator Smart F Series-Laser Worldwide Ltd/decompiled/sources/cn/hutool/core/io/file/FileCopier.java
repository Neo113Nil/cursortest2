package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.lang.copier.SrcToDestCopier;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FileCopier extends SrcToDestCopier<File, FileCopier> {
    private static final long serialVersionUID = 1;
    private boolean isCopyAttributes;
    private boolean isCopyContentIfDir;
    private boolean isOnlyCopyFile;
    private boolean isOverride;

    /* JADX WARN: Multi-variable type inference failed */
    public FileCopier(File file, File file2) {
        this.src = file;
        this.dest = file2;
    }

    public static FileCopier create(String str, String str2) {
        return new FileCopier(cn.hutool.core.io.l.file(str), cn.hutool.core.io.l.file(str2));
    }

    private void internalCopyDirContent(File file, File file2) {
        cn.hutool.core.lang.a0 a0Var = this.copyFilter;
        if (a0Var == null || a0Var.accept(file)) {
            if (!file2.exists()) {
                file2.mkdirs();
            } else if (!file2.isDirectory()) {
                throw new IORuntimeException(cn.hutool.core.text.l.format("Src [{}] is a directory but dest [{}] is a file!", file.getPath(), file2.getPath()));
            }
            String[] list = file.list();
            if (cn.hutool.core.util.h.isNotEmpty((Object[]) list)) {
                for (String str : list) {
                    File file3 = new File(file, str);
                    File file4 = this.isOnlyCopyFile ? file2 : new File(file2, str);
                    if (file3.isDirectory()) {
                        internalCopyDirContent(file3, file4);
                    } else {
                        internalCopyFile(file3, file4);
                    }
                }
            }
        }
    }

    private File internalCopyFile(File file, File file2) {
        Path path;
        Path path2;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        cn.hutool.core.lang.a0 a0Var = this.copyFilter;
        if (a0Var != null && !a0Var.accept(file)) {
            return file;
        }
        if (file2.exists()) {
            if (file2.isDirectory()) {
                file2 = new File(file2, file.getName());
            }
            if (file2.exists() && !this.isOverride) {
                return file;
            }
        } else {
            cn.hutool.core.io.l.mkParentDirs(file2);
        }
        ArrayList arrayList = new ArrayList(2);
        if (this.isOverride) {
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            arrayList.add(standardCopyOption2);
        }
        if (this.isCopyAttributes) {
            standardCopyOption = StandardCopyOption.COPY_ATTRIBUTES;
            arrayList.add(standardCopyOption);
        }
        try {
            path = file.toPath();
            path2 = file2.toPath();
            Files.copy(path, path2, (CopyOption[]) arrayList.toArray(new CopyOption[0]));
            return file2;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public boolean isCopyAttributes() {
        return this.isCopyAttributes;
    }

    public boolean isCopyContentIfDir() {
        return this.isCopyContentIfDir;
    }

    public boolean isOnlyCopyFile() {
        return this.isOnlyCopyFile;
    }

    public boolean isOverride() {
        return this.isOverride;
    }

    public FileCopier setCopyAttributes(boolean z7) {
        this.isCopyAttributes = z7;
        return this;
    }

    public FileCopier setCopyContentIfDir(boolean z7) {
        this.isCopyContentIfDir = z7;
        return this;
    }

    public FileCopier setOnlyCopyFile(boolean z7) {
        this.isOnlyCopyFile = z7;
        return this;
    }

    public FileCopier setOverride(boolean z7) {
        this.isOverride = z7;
        return this;
    }

    public static FileCopier create(File file, File file2) {
        return new FileCopier(file, file2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.hutool.core.lang.copier.SrcToDestCopier, cn.hutool.core.lang.copier.a
    public File copy() {
        File file = (File) this.src;
        File file2 = (File) this.dest;
        cn.hutool.core.lang.q.notNull(file, "Source File is null !", new Object[0]);
        if (!file.exists()) {
            throw new IORuntimeException("File not exist: " + file);
        }
        cn.hutool.core.lang.q.notNull(file2, "Destination File or directiory is null !", new Object[0]);
        if (cn.hutool.core.io.l.equals(file, file2)) {
            throw new IORuntimeException("Files '{}' and '{}' are equal", file, file2);
        }
        if (!file.isDirectory()) {
            return internalCopyFile(file, file2);
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IORuntimeException("Src is a directory but dest is a file!");
        }
        if (cn.hutool.core.io.l.isSub(file, file2)) {
            throw new IORuntimeException("Dest is a sub directory of src !");
        }
        internalCopyDirContent(file, this.isCopyContentIfDir ? file2 : cn.hutool.core.io.l.mkdir(cn.hutool.core.io.l.file(file2, file.getName())));
        return file2;
    }
}
