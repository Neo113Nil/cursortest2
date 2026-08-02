package okio.assetfilesystem;

import android.content.res.AssetManager;
import com.plaid.internal.EnumC0170g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AssetFileSystem extends FileSystem {
    public static final Path ROOT;
    public final AssetManager assets;

    static {
        String str = Path.DIRECTORY_SEPARATOR;
        ROOT = Path.Companion.get("/", false);
    }

    public AssetFileSystem(AssetManager assetManager) {
        this.assets = assetManager;
    }

    public static String toAssetRelativePathString(Path path) {
        return StringsKt.removePrefix("/", path.bytes.utf8());
    }

    @Override // okio.FileSystem
    public final Sink appendingSink(Path path) {
        path.getClass();
        throw new IOException("asset file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void atomicMove(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        throw new IOException("asset file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void createDirectory(Path path) {
        path.getClass();
        throw new IOException("asset file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void delete(Path path, boolean z) {
        path.getClass();
        throw new IOException("asset file systems are read-only");
    }

    public final boolean existsInternal(Path path) {
        if (path.equals(ROOT)) {
            return true;
        }
        Path parent = path.parent();
        if (parent == null) {
            Handlers$$ExternalSyntheticBUOutline0.m(path, "Path has no parent. Did you canonicalize? ");
            return false;
        }
        String[] list = this.assets.list(toAssetRelativePathString(parent));
        if (list == null) {
            list = new String[0];
        }
        return ArraysKt___ArraysKt.contains(list, path.name());
    }

    @Override // okio.FileSystem
    public final List list(Path path) {
        ArrayList arrayList;
        AssetManager assetManager = this.assets;
        path.getClass();
        Path path2 = ROOT;
        path2.getClass();
        Path commonResolve = okio.internal.Path.commonResolve(path2, path, true);
        if (existsInternal(commonResolve)) {
            String assetRelativePathString = toAssetRelativePathString(commonResolve);
            try {
                assetManager.open(assetRelativePathString).close();
            } catch (FileNotFoundException unused) {
                String[] list = assetManager.list(assetRelativePathString);
                if (list != null) {
                    arrayList = new ArrayList(list.length);
                    for (String str : list) {
                        String str2 = Path.DIRECTORY_SEPARATOR;
                        str.getClass();
                        arrayList.add(Path.Companion.get(str, false));
                    }
                } else {
                    arrayList = null;
                }
                return arrayList == null ? EmptyList.INSTANCE : arrayList;
            }
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.FileSystem
    public final List listOrNull(Path path) {
        path.getClass();
        try {
            return list(path);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // okio.FileSystem
    public final FileMetadata metadataOrNull(Path path) {
        path.getClass();
        Path path2 = ROOT;
        path2.getClass();
        Path commonResolve = okio.internal.Path.commonResolve(path2, path, true);
        if (!existsInternal(commonResolve)) {
            return null;
        }
        try {
            this.assets.open(toAssetRelativePathString(commonResolve)).close();
            return new FileMetadata(true, false, (Path) null, (Long) null, (Long) null, (Long) null, (Long) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        } catch (FileNotFoundException unused) {
            return new FileMetadata(false, true, (Path) null, (Long) null, (Long) null, (Long) null, (Long) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        }
    }

    @Override // okio.FileSystem
    public final FileHandle openReadOnly(Path path) {
        path.getClass();
        Path path2 = ROOT;
        path2.getClass();
        String assetRelativePathString = toAssetRelativePathString(okio.internal.Path.commonResolve(path2, path, true));
        AssetManager assetManager = this.assets;
        InputStream open = assetManager.open(assetRelativePathString);
        open.getClass();
        return new AssetFileHandle(assetManager, assetRelativePathString, open);
    }

    @Override // okio.FileSystem
    public final Sink sink(Path path, boolean z) {
        path.getClass();
        throw new IOException("asset file systems are read-only");
    }

    @Override // okio.FileSystem
    public final Source source(Path path) {
        path.getClass();
        Path path2 = ROOT;
        path2.getClass();
        InputStream open = this.assets.open(toAssetRelativePathString(okio.internal.Path.commonResolve(path2, path, true)));
        open.getClass();
        return Okio.source(open);
    }
}
