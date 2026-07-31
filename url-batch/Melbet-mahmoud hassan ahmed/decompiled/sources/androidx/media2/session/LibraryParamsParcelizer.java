package androidx.media2.session;

/* loaded from: classes.dex */
public final class LibraryParamsParcelizer {
    public static MediaLibraryService$LibraryParams read(androidx.versionedparcelable.a aVar) {
        MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams = new MediaLibraryService$LibraryParams();
        mediaLibraryService$LibraryParams.f1183a = aVar.k(mediaLibraryService$LibraryParams.f1183a, 1);
        mediaLibraryService$LibraryParams.f1184b = aVar.v(mediaLibraryService$LibraryParams.f1184b, 2);
        mediaLibraryService$LibraryParams.f1185c = aVar.v(mediaLibraryService$LibraryParams.f1185c, 3);
        mediaLibraryService$LibraryParams.f1186d = aVar.v(mediaLibraryService$LibraryParams.f1186d, 4);
        return mediaLibraryService$LibraryParams;
    }

    public static void write(MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.O(mediaLibraryService$LibraryParams.f1183a, 1);
        aVar.Y(mediaLibraryService$LibraryParams.f1184b, 2);
        aVar.Y(mediaLibraryService$LibraryParams.f1185c, 3);
        aVar.Y(mediaLibraryService$LibraryParams.f1186d, 4);
    }
}
