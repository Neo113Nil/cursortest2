package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfr implements bbu {
    private Object a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public bfr(Uri uri, cfz cfzVar, int i) {
        this.b = i;
        this.d = uri;
        this.c = cfzVar;
    }

    public static bfr b(Context context, Uri uri, bcn bcnVar) {
        return new bfr(uri, new cfz(azj.b(context).c.a().b(), bcnVar, azj.b(context).e, context.getContentResolver()), 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bfs, java.lang.Object] */
    @Override // defpackage.bbu
    public final Class a() {
        return this.b != 0 ? InputStream.class : this.d.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bfs, java.lang.Object] */
    @Override // defpackage.bbu
    public final void d() {
        int i = this.b;
        Object obj = this.a;
        try {
            if (i != 0) {
                if (obj != null) {
                    ((InputStream) obj).close();
                }
            } else if (obj != null) {
                this.d.c(obj);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[Catch: FileNotFoundException -> 0x00d6, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x00d6, blocks: (B:4:0x0006, B:59:0x0024, B:12:0x003d, B:17:0x0095, B:22:0x00ca, B:23:0x00d0, B:38:0x00c1, B:44:0x0045, B:46:0x0050, B:48:0x005a, B:50:0x005e, B:53:0x006a, B:54:0x0091, B:10:0x002d, B:67:0x0034, B:68:0x0037, B:19:0x0099), top: B:3:0x0006, inners: #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca A[Catch: FileNotFoundException -> 0x00d6, TRY_ENTER, TryCatch #8 {FileNotFoundException -> 0x00d6, blocks: (B:4:0x0006, B:59:0x0024, B:12:0x003d, B:17:0x0095, B:22:0x00ca, B:23:0x00d0, B:38:0x00c1, B:44:0x0045, B:46:0x0050, B:48:0x005a, B:50:0x005e, B:53:0x006a, B:54:0x0091, B:10:0x002d, B:67:0x0034, B:68:0x0037, B:19:0x0099), top: B:3:0x0006, inners: #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045 A[Catch: FileNotFoundException -> 0x00d6, TryCatch #8 {FileNotFoundException -> 0x00d6, blocks: (B:4:0x0006, B:59:0x0024, B:12:0x003d, B:17:0x0095, B:22:0x00ca, B:23:0x00d0, B:38:0x00c1, B:44:0x0045, B:46:0x0050, B:48:0x005a, B:50:0x005e, B:53:0x006a, B:54:0x0091, B:10:0x002d, B:67:0x0034, B:68:0x0037, B:19:0x0099), top: B:3:0x0006, inners: #10, #11 }] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [bcn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [bfs, java.lang.Object] */
    @Override // defpackage.bbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(azw azwVar, bbt bbtVar) {
        Cursor cursor;
        String str;
        InputStream openInputStream;
        int i;
        if (this.b == 0) {
            try {
                Object b = this.d.b((File) this.c);
                this.a = b;
                bbtVar.b(b);
                return;
            } catch (FileNotFoundException e) {
                bbtVar.e(e);
                return;
            }
        }
        try {
            Object obj = this.c;
            Object obj2 = this.d;
            Cursor cursor2 = null;
            r2 = null;
            InputStream inputStream = null;
            try {
                cursor = ((cfz) obj).a.a((Uri) obj2);
            } catch (SecurityException unused) {
                cursor = null;
            } catch (Throwable th) {
                th = th;
            }
            if (cursor != null) {
                try {
                } catch (SecurityException unused2) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    str = null;
                    if (!TextUtils.isEmpty(str)) {
                    }
                    openInputStream = null;
                    if (openInputStream != null) {
                    }
                    i = -1;
                    if (i != -1) {
                    }
                    this.a = openInputStream;
                    bbtVar.b(openInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
                if (cursor.moveToFirst()) {
                    str = cursor.getString(0);
                    cursor.close();
                    if (!TextUtils.isEmpty(str)) {
                        File file = new File(str);
                        if (file.exists() && file.length() > 0) {
                            Uri fromFile = Uri.fromFile(file);
                            try {
                                openInputStream = ((ContentResolver) ((cfz) obj).c).openInputStream(fromFile);
                                if (openInputStream != null) {
                                    Object obj3 = this.c;
                                    try {
                                        inputStream = ((ContentResolver) ((cfz) obj3).c).openInputStream((Uri) this.d);
                                        i = afn.p(((cfz) obj3).b, inputStream, (bek) ((cfz) obj3).d);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                    } catch (IOException | NullPointerException unused4) {
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused6) {
                                            }
                                        }
                                        throw th3;
                                    }
                                    if (i != -1) {
                                        openInputStream = new bca(openInputStream, i);
                                    }
                                    this.a = openInputStream;
                                    bbtVar.b(openInputStream);
                                }
                                i = -1;
                                if (i != -1) {
                                }
                                this.a = openInputStream;
                                bbtVar.b(openInputStream);
                            } catch (NullPointerException e2) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + String.valueOf(obj2) + " -> " + String.valueOf(fromFile)).initCause(e2));
                            }
                        }
                    }
                    openInputStream = null;
                    if (openInputStream != null) {
                    }
                    i = -1;
                    if (i != -1) {
                    }
                    this.a = openInputStream;
                    bbtVar.b(openInputStream);
                }
            }
        } catch (FileNotFoundException e3) {
            bbtVar.e(e3);
        }
    }

    @Override // defpackage.bbu
    public final int g() {
        return 1;
    }

    public bfr(File file, bfs bfsVar, int i) {
        this.b = i;
        this.c = file;
        this.d = bfsVar;
    }

    @Override // defpackage.bbu
    public final void bo() {
    }
}
