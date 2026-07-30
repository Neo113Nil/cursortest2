package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/* loaded from: classes.dex */
public class PathConverter extends AbstractConverter<Path> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Path convertInternal(Object obj) {
        Path path;
        Path path2;
        Path path3;
        Path path4;
        try {
            if (obj instanceof URI) {
                path4 = Paths.get((URI) obj);
                return path4;
            }
            if (obj instanceof URL) {
                path3 = Paths.get(((URL) obj).toURI());
                return path3;
            }
            if (obj instanceof File) {
                path2 = ((File) obj).toPath();
                return path2;
            }
            path = Paths.get(convertToStr(obj), new String[0]);
            return path;
        } catch (Exception unused) {
            return null;
        }
    }
}
