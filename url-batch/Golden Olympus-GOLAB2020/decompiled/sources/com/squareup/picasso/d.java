package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.q;
import com.squareup.picasso.v;
import java.io.InputStream;

/* loaded from: classes2.dex */
class d extends v {

    /* renamed from: b, reason: collision with root package name */
    private static final UriMatcher f21696b;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21697a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f21696b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    d(Context context) {
        this.f21697a = context;
    }

    private InputStream j(t tVar) {
        ContentResolver contentResolver = this.f21697a.getContentResolver();
        Uri uri = tVar.f21808d;
        int match = f21696b.match(uri);
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

    @Override // com.squareup.picasso.v
    public boolean c(t tVar) {
        Uri uri = tVar.f21808d;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f21696b.match(tVar.f21808d) != -1;
    }

    @Override // com.squareup.picasso.v
    public v.a f(t tVar, int i4) {
        InputStream j4 = j(tVar);
        if (j4 == null) {
            return null;
        }
        return new v.a(okio.p.k(j4), q.e.DISK);
    }
}
