package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.w;
import java.io.InputStream;
import okio.j0;

/* loaded from: classes4.dex */
class f extends w {
    private static final int ID_CONTACT = 3;
    private static final int ID_DISPLAY_PHOTO = 4;
    private static final int ID_LOOKUP = 1;
    private static final int ID_THUMBNAIL = 2;
    private static final UriMatcher matcher;
    private final Context context;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        matcher = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    f(Context context) {
        this.context = context;
    }

    private InputStream getInputStream(u uVar) {
        ContentResolver contentResolver = this.context.getContentResolver();
        Uri uri = uVar.uri;
        int match = matcher.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.squareup.picasso.w
    public boolean canHandleRequest(u uVar) {
        Uri uri = uVar.uri;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && matcher.match(uVar.uri) != -1;
    }

    @Override // com.squareup.picasso.w
    public w.a load(u uVar, int i8) {
        InputStream inputStream = getInputStream(uVar);
        if (inputStream == null) {
            return null;
        }
        return new w.a(j0.source(inputStream), Picasso.LoadedFrom.DISK);
    }
}
