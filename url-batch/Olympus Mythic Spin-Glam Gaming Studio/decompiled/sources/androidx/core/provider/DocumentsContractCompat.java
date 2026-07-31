package androidx.core.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

/* loaded from: classes10.dex */
public final class DocumentsContractCompat {

    public static final class DocumentCompat {
    }

    @RequiresApi
    private static class DocumentsContractApi21Impl {
        @DoNotInline
        static String getTreeDocumentId(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @DoNotInline
        public static Uri buildTreeDocumentUri(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @DoNotInline
        static Uri buildDocumentUriUsingTree(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @DoNotInline
        static Uri buildChildDocumentsUri(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @DoNotInline
        static Uri buildChildDocumentsUriUsingTree(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @DoNotInline
        static Uri createDocument(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @DoNotInline
        static Uri renameDocument(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    @RequiresApi
    private static class DocumentsContractApi24Impl {
        @DoNotInline
        static boolean isTreeUri(@NonNull Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @DoNotInline
        static boolean removeDocument(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }
}
