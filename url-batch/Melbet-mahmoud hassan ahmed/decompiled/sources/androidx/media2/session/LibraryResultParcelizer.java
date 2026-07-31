package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;

/* loaded from: classes.dex */
public final class LibraryResultParcelizer {
    public static LibraryResult read(androidx.versionedparcelable.a aVar) {
        LibraryResult libraryResult = new LibraryResult();
        libraryResult.f1171a = aVar.v(libraryResult.f1171a, 1);
        libraryResult.f1172b = aVar.y(libraryResult.f1172b, 2);
        libraryResult.f1174d = (MediaItem) aVar.I(libraryResult.f1174d, 3);
        libraryResult.f1175e = (MediaLibraryService$LibraryParams) aVar.I(libraryResult.f1175e, 4);
        libraryResult.f1177g = (ParcelImplListSlice) aVar.A(libraryResult.f1177g, 5);
        libraryResult.c();
        return libraryResult;
    }

    public static void write(LibraryResult libraryResult, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        libraryResult.d(aVar.g());
        aVar.Y(libraryResult.f1171a, 1);
        aVar.b0(libraryResult.f1172b, 2);
        aVar.m0(libraryResult.f1174d, 3);
        aVar.m0(libraryResult.f1175e, 4);
        aVar.d0(libraryResult.f1177g, 5);
    }
}
