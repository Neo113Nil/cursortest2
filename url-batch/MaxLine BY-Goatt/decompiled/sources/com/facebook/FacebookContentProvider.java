package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.NativeAppCallAttachmentStore;
import defpackage.up2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FacebookContentProvider extends ContentProvider {
    private static final String ATTACHMENT_URL_BASE = "content://com.facebook.app.FacebookContentProvider";
    private static final String INVALID_FILE_NAME = "..";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = FacebookContentProvider.class.getName();

    public static final String getAttachmentUrl(String str, UUID uuid, String str2) {
        return Companion.getAttachmentUrl(str, uuid, str2);
    }

    private final Pair<UUID, String> parseCallIdAndAttachmentName(Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String[] strArr = (String[]) up2.F(0, 6, path.substring(1), new String[]{"/"}).toArray(new String[0]);
            String str = strArr[0];
            String str2 = strArr[1];
            if (INVALID_FILE_NAME.contentEquals(str) || INVALID_FILE_NAME.contentEquals(str2)) {
                throw new Exception();
            }
            return new Pair<>(UUID.fromString(str), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        Pair<UUID, String> parseCallIdAndAttachmentName = parseCallIdAndAttachmentName(uri);
        if (parseCallIdAndAttachmentName == null) {
            throw new FileNotFoundException();
        }
        try {
            File openAttachment = NativeAppCallAttachmentStore.openAttachment((UUID) parseCallIdAndAttachmentName.first, (String) parseCallIdAndAttachmentName.second);
            if (openAttachment != null) {
                return ParcelFileDescriptor.open(openAttachment, 268435456);
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            Log.e(TAG, "Got unexpected exception:" + e);
            throw e;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getAttachmentUrl(String str, UUID uuid, String str2) {
            uuid.getClass();
            return String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{FacebookContentProvider.ATTACHMENT_URL_BASE, str, uuid.toString(), str2}, 4));
        }

        private Companion() {
        }
    }
}
