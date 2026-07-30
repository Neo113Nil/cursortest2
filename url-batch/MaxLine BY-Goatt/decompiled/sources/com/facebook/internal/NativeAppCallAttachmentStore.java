package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ey;
import defpackage.q40;
import defpackage.tp2;
import defpackage.ul0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class NativeAppCallAttachmentStore {
    public static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
    public static final NativeAppCallAttachmentStore INSTANCE = new NativeAppCallAttachmentStore();
    private static final String TAG = NativeAppCallAttachmentStore.class.getName();
    private static File attachmentsDirectory;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Attachment {
        private final String attachmentName;
        private final String attachmentUrl;
        private final Bitmap bitmap;
        private final UUID callId;
        private boolean isContentUri;
        private final Uri originalUri;
        private boolean shouldCreateFile;

        public Attachment(UUID uuid, Bitmap bitmap, Uri uri) {
            uuid.getClass();
            this.callId = uuid;
            this.bitmap = bitmap;
            this.originalUri = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (FirebaseAnalytics.Param.CONTENT.equalsIgnoreCase(scheme)) {
                    this.isContentUri = true;
                    String authority = uri.getAuthority();
                    this.shouldCreateFile = (authority == null || tp2.o(authority, ShareConstants.WEB_DIALOG_PARAM_MEDIA, false)) ? false : true;
                } else if (ShareInternalUtility.STAGING_PARAM.equalsIgnoreCase(uri.getScheme())) {
                    this.shouldCreateFile = true;
                } else if (!Utility.isWebUri(uri)) {
                    throw new FacebookException(q40.l("Unsupported scheme for media Uri : ", scheme));
                }
            } else {
                if (bitmap == null) {
                    ey.i("Cannot share media without a bitmap or Uri set");
                    throw null;
                }
                this.shouldCreateFile = true;
            }
            String uuid2 = this.shouldCreateFile ? UUID.randomUUID().toString() : null;
            this.attachmentName = uuid2;
            this.attachmentUrl = !this.shouldCreateFile ? String.valueOf(uri) : FacebookContentProvider.Companion.getAttachmentUrl(FacebookSdk.getApplicationId(), uuid, uuid2);
        }

        public final String getAttachmentName() {
            return this.attachmentName;
        }

        public final String getAttachmentUrl() {
            return this.attachmentUrl;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final UUID getCallId() {
            return this.callId;
        }

        public final Uri getOriginalUri() {
            return this.originalUri;
        }

        public final boolean getShouldCreateFile() {
            return this.shouldCreateFile;
        }

        public final boolean isContentUri() {
            return this.isContentUri;
        }

        public final void setContentUri(boolean z) {
            this.isContentUri = z;
        }

        public final void setShouldCreateFile(boolean z) {
            this.shouldCreateFile = z;
        }
    }

    private NativeAppCallAttachmentStore() {
    }

    public static final void addAttachments(Collection<Attachment> collection) {
        File attachmentFile;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        if (attachmentsDirectory == null) {
            cleanupAllAttachments();
        }
        ensureAttachmentsDirectoryExists();
        ArrayList arrayList = new ArrayList();
        try {
            for (Attachment attachment : collection) {
                if (attachment.getShouldCreateFile() && (attachmentFile = getAttachmentFile(attachment.getCallId(), attachment.getAttachmentName(), true)) != null) {
                    arrayList.add(attachmentFile);
                    if (attachment.getBitmap() != null) {
                        INSTANCE.processAttachmentBitmap(attachment.getBitmap(), attachmentFile);
                    } else if (attachment.getOriginalUri() != null) {
                        INSTANCE.processAttachmentFile(attachment.getOriginalUri(), attachment.isContentUri(), attachmentFile);
                    }
                }
            }
        } catch (IOException e) {
            Log.e(TAG, "Got unexpected exception:" + e);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                File file = (File) obj;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            throw new FacebookException(e);
        }
    }

    public static final void cleanupAllAttachments() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            ul0.d(attachmentsDirectory2);
        }
    }

    public static final void cleanupAttachmentsForCall(UUID uuid) {
        uuid.getClass();
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(uuid, false);
        if (attachmentsDirectoryForCall != null) {
            ul0.d(attachmentsDirectoryForCall);
        }
    }

    public static final Attachment createAttachment(UUID uuid, Bitmap bitmap) {
        uuid.getClass();
        bitmap.getClass();
        return new Attachment(uuid, bitmap, null);
    }

    public static final File ensureAttachmentsDirectoryExists() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            attachmentsDirectory2.mkdirs();
        }
        return attachmentsDirectory2;
    }

    public static final File getAttachmentFile(UUID uuid, String str, boolean z) {
        uuid.getClass();
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(uuid, z);
        if (attachmentsDirectoryForCall == null) {
            return null;
        }
        try {
            return new File(attachmentsDirectoryForCall, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final synchronized File getAttachmentsDirectory() {
        File file;
        synchronized (NativeAppCallAttachmentStore.class) {
            try {
                if (attachmentsDirectory == null) {
                    attachmentsDirectory = new File(FacebookSdk.getApplicationContext().getCacheDir(), ATTACHMENTS_DIR_NAME);
                }
                file = attachmentsDirectory;
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public static final File getAttachmentsDirectoryForCall(UUID uuid, boolean z) {
        uuid.getClass();
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final File openAttachment(UUID uuid, String str) {
        if (Utility.isNullOrEmpty(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return getAttachmentFile(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    private final void processAttachmentBitmap(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            Utility.closeQuietly(fileOutputStream);
        }
    }

    private final void processAttachmentFile(Uri uri, boolean z, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Utility.copyAndCloseInputStream(!z ? new FileInputStream(uri.getPath()) : FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri), fileOutputStream);
            Utility.closeQuietly(fileOutputStream);
        } catch (Throwable th) {
            Utility.closeQuietly(fileOutputStream);
            throw th;
        }
    }

    public static final Attachment createAttachment(UUID uuid, Uri uri) {
        uuid.getClass();
        uri.getClass();
        return new Attachment(uuid, null, uri);
    }
}
