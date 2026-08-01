package expo.modules.filesystem.unifiedfile;

import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import com.caverock.androidsvg.SVGParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.FileWalkDirection;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: JavaFile.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000!H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lexpo/modules/filesystem/unifiedfile/JavaFile;", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "Ljava/io/File;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "parentFile", "getParentFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "createFile", "mimeType", "", "displayName", "createDirectory", "listFilesAsUnified", "", SVGParser.XML_STYLESHEET_ATTR_TYPE, "getType", "()Ljava/lang/String;", "fileName", "getFileName", "creationTime", "", "getCreationTime", "()Ljava/lang/Long;", "outputStream", "Ljava/io/OutputStream;", "inputStream", "Ljava/io/InputStream;", "walkTopDown", "Lkotlin/sequences/Sequence;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JavaFile extends File implements UnifiedFileInterface {
    private final Uri uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaFile(Uri uri) {
        super(URI.create(uri.toString()));
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getUri() {
        return this.uri;
    }

    @Override // java.io.File, expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public /* bridge */ /* synthetic */ Long lastModified() {
        return Long.valueOf(lastModified());
    }

    @Override // java.io.File, expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface getParentFile() {
        Uri fromFile;
        File parentFile = super.getParentFile();
        return (parentFile == null || (fromFile = Uri.fromFile(parentFile)) == null) ? null : new JavaFile(fromFile);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createFile(String mimeType, String displayName) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        File file = new File(super.getParentFile(), displayName);
        file.createNewFile();
        return new JavaFile(Uri.fromFile(file));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createDirectory(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        File file = new File(super.getParentFile(), displayName);
        file.mkdir();
        return new JavaFile(Uri.fromFile(file));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public List<UnifiedFileInterface> listFilesAsUnified() {
        File[] listFiles = super.listFiles();
        if (listFiles == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            Intrinsics.checkNotNull(file);
            arrayList.add(new JavaFile(Uri.fromFile(file)));
        }
        return arrayList;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getPath());
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getFileName() {
        return super.getName();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long getCreationTime() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        String path = getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        Path path2 = Paths.get(path, new String[0]);
        Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
        BasicFileAttributes readAttributes = Files.readAttributes(path2, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
        Intrinsics.checkNotNullExpressionValue(readAttributes, "readAttributes(...)");
        Duration.Companion companion = Duration.INSTANCE;
        return Long.valueOf(Duration.m2161getInWholeMillisecondsimpl(DurationKt.toDuration(readAttributes.creationTime().toMillis(), DurationUnit.MILLISECONDS)));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public OutputStream outputStream() {
        return new FileOutputStream(this);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public InputStream inputStream() {
        return new FileInputStream(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaFile walkTopDown$lambda$3(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new JavaFile(Uri.fromFile(it));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Sequence<JavaFile> walkTopDown() {
        return SequencesKt.map(FilesKt.walk(this, FileWalkDirection.TOP_DOWN), new Function1() { // from class: expo.modules.filesystem.unifiedfile.JavaFile$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                JavaFile walkTopDown$lambda$3;
                walkTopDown$lambda$3 = JavaFile.walkTopDown$lambda$3((File) obj);
                return walkTopDown$lambda$3;
            }
        });
    }
}
