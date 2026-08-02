package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bck extends bcg {
    private static final UriMatcher b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    private static final InputStream h(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // defpackage.bbu
    public final Class a() {
        return InputStream.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    @Override // defpackage.bcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* bridge */ /* synthetic */ Object b(Uri uri, ContentResolver contentResolver) {
        InputStream h;
        int match = b.match(uri);
        if (match != 1) {
            if (match == 3) {
                h = h(contentResolver, uri);
            } else if (match != 5) {
                if (this.a && afn.i(uri) && afn.h()) {
                    AssetFileDescriptor g = afn.g(uri, contentResolver);
                    if (g == null) {
                        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
                    }
                    try {
                        h = g.createInputStream();
                    } catch (IOException e) {
                        try {
                            g.close();
                        } catch (Exception unused) {
                        }
                        throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e));
                    }
                } else {
                    h = contentResolver.openInputStream(uri);
                }
            }
            if (h == null) {
                return h;
            }
            throw new FileNotFoundException("InputStream is null for ".concat(String.valueOf(String.valueOf(uri))));
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact == null) {
            throw new FileNotFoundException("Contact cannot be found");
        }
        h = h(contentResolver, lookupContact);
        if (h == null) {
        }
    }

    @Override // defpackage.bcg
    protected final /* synthetic */ void c(Object obj) {
        ((InputStream) obj).close();
    }
}
