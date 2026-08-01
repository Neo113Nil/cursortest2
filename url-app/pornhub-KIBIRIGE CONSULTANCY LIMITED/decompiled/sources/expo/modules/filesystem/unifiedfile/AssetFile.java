package expo.modules.filesystem.unifiedfile;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.caverock.androidsvg.SVGParser;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: AssetFile.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0016J\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0002\u0010 J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000+H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0016\u0010!\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\rR\u0016\u0010#\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 ¨\u0006,"}, d2 = {"Lexpo/modules/filesystem/unifiedfile/AssetFile;", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/content/Context;Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "path", "", "getPath", "()Ljava/lang/String;", "exists", "", "isDirectory", "isFile", "parentFile", "getParentFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "createFile", "mimeType", "displayName", "createDirectory", "delete", "listFilesAsUnified", "", SVGParser.XML_STYLESHEET_ATTR_TYPE, "getType", "lastModified", "", "()Ljava/lang/Long;", "fileName", "getFileName", "creationTime", "getCreationTime", "outputStream", "Ljava/io/OutputStream;", "inputStream", "Ljava/io/InputStream;", "length", "walkTopDown", "Lkotlin/sequences/Sequence;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AssetFile implements UnifiedFileInterface {
    private final Context context;
    private final String path;
    private final Uri uri;

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long getCreationTime() {
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long lastModified() {
        return null;
    }

    public AssetFile(Context context, Uri uri) {
        String trimStart;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.context = context;
        this.uri = uri;
        String path = getUri().getPath();
        if (path == null || (trimStart = StringsKt.trimStart(path, IOUtils.DIR_SEPARATOR_UNIX)) == null) {
            throw new IllegalArgumentException("Invalid asset URI: " + getUri());
        }
        this.path = trimStart;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getUri() {
        return this.uri;
    }

    public final String getPath() {
        return this.path;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean exists() {
        return isDirectory() || isFile();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isDirectory() {
        String[] list = this.context.getAssets().list(this.path);
        if (list != null) {
            if (!(list.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isFile() {
        Object m788constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AssetFile assetFile = this;
            InputStream open = this.context.getAssets().open(this.path);
            try {
                InputStream inputStream = open;
                CloseableKt.closeFinally(open, null);
                m788constructorimpl = Result.m788constructorimpl(true);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m788constructorimpl = Result.m788constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m791exceptionOrNullimpl(m788constructorimpl) != null) {
            m788constructorimpl = false;
        }
        return ((Boolean) m788constructorimpl).booleanValue();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface getParentFile() {
        String path = getUri().getPath();
        if (path == null) {
            path = "";
        }
        if (path.length() == 0) {
            return null;
        }
        return new AssetFile(this.context, Uri.parse("asset://" + StringsKt.substringBeforeLast$default(path, IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null)));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createFile(String mimeType, String displayName) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        throw new UnsupportedOperationException("Asset files are not writable and cannot be created");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createDirectory(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        throw new UnsupportedOperationException("Asset directories are not writable and cannot be created");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean delete() {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be deleted");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public List<UnifiedFileInterface> listFilesAsUnified() {
        String[] list = this.context.getAssets().list(this.path);
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.length);
        for (String str : list) {
            arrayList.add(new AssetFile(this.context, Uri.fromFile(new File(this.path, str))));
        }
        return arrayList;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getUri().toString());
        Intrinsics.checkNotNull(fileExtensionFromUrl);
        if (fileExtensionFromUrl.length() <= 0) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getFileName() {
        return getUri().getLastPathSegment();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public OutputStream outputStream() {
        throw new UnsupportedOperationException("Asset files are not writable");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public InputStream inputStream() {
        InputStream open = this.context.getAssets().open(this.path);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        return open;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public long length() {
        InputStream open;
        long length;
        try {
            Result.Companion companion = Result.INSTANCE;
            AssetFile assetFile = this;
            open = this.context.getAssets().openFd(this.path);
            try {
                length = open.getLength();
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m788constructorimpl(ResultKt.createFailure(th));
        }
        if (length > 0) {
            CloseableKt.closeFinally(open, null);
            return length;
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(open, null);
        Result.m788constructorimpl(Unit.INSTANCE);
        try {
            Result.Companion companion3 = Result.INSTANCE;
            AssetFile assetFile2 = this;
            open = this.context.getAssets().open(this.path);
            try {
                InputStream inputStream = open;
                byte[] bArr = new byte[8192];
                long j = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(open, null);
                        return j;
                    }
                    j += read;
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m788constructorimpl(ResultKt.createFailure(th2));
            return 0L;
        }
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Sequence<AssetFile> walkTopDown() {
        return SequencesKt.sequence(new AssetFile$walkTopDown$1(this, null));
    }
}
