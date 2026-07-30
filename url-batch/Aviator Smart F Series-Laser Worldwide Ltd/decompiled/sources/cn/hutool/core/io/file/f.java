package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.map.h1;
import cn.hutool.core.util.g1;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {
    public static FileSystem create(String str) {
        Path path;
        URI uri;
        FileSystem newFileSystem;
        try {
            path = Paths.get(str, new String[0]);
            uri = path.toUri();
            newFileSystem = FileSystems.newFileSystem(uri, (Map<String, ?>) h1.of("create", "true"));
            return newFileSystem;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static FileSystem createZip(String str) {
        return createZip(str, null);
    }

    public static Path getRoot(FileSystem fileSystem) {
        Path path;
        path = fileSystem.getPath("/", new String[0]);
        return path;
    }

    public static FileSystem createZip(String str, Charset charset) {
        Path path;
        URI uri;
        FileSystem newFileSystem;
        if (charset == null) {
            charset = cn.hutool.core.util.l.CHARSET_UTF_8;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("create", "true");
        hashMap.put("encoding", charset.name());
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(g1.JAR_URL_PREFIX);
            path = Paths.get(str, new String[0]);
            uri = path.toUri();
            sb.append(uri);
            newFileSystem = FileSystems.newFileSystem(URI.create(sb.toString()), (Map<String, ?>) hashMap);
            return newFileSystem;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }
}
