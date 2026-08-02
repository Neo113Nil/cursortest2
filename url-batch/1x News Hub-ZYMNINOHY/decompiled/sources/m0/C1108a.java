package m0;

import E1.AbstractActivityC0029e;
import O.g;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;
import b2.C0195i;
import d2.InterfaceC0300c;
import f2.i;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.j;
import l2.p;
import t2.InterfaceC1210u;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108a extends i implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1110c f9947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108a(C1110c c1110c, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f9947e = c1110c;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new C1108a(this.f9947e, interfaceC0300c);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x029d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // f2.AbstractC0324a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        int i3;
        byte[] byteArray;
        int i4;
        Uri insert;
        OutputStream openOutputStream;
        boolean z;
        boolean z2;
        g gVar;
        O.c c3;
        int e3;
        android.support.v4.media.session.a.T(obj);
        C1110c c1110c = this.f9947e;
        EnumC1112e enumC1112e = c1110c.f9952c;
        EnumC1112e enumC1112e2 = EnumC1112e.f9959b;
        AbstractActivityC0029e abstractActivityC0029e = c1110c.f9950a;
        if (enumC1112e == enumC1112e2) {
            ContentResolver contentResolver = abstractActivityC0029e.getContentResolver();
            j.d(contentResolver, "getContentResolver(...)");
            String str = c1110c.f9953d;
            String str2 = c1110c.f9954e;
            boolean z3 = c1110c.f;
            File file = new File(str);
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.toString()));
            String str3 = Environment.DIRECTORY_MOVIES;
            if (z3) {
                str3 = Environment.DIRECTORY_DCIM;
            }
            String absolutePath = new File(new File(S0.a.l(str2, enumC1112e2, z3)), file.getName()).getAbsolutePath();
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", file.getName());
            contentValues.put("_display_name", file.getName());
            contentValues.put("mime_type", mimeTypeFromExtension);
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            if (Build.VERSION.SDK_INT < 29) {
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    j.b(extractMetadata);
                    contentValues.put("duration", Integer.valueOf(Integer.parseInt(extractMetadata)));
                    contentValues.put("_data", absolutePath);
                } catch (Exception unused) {
                }
            } else {
                contentValues.put("relative_path", str3 + File.separator + str2);
            }
            try {
                Uri insert2 = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                FileInputStream fileInputStream = new FileInputStream(file);
                if (insert2 != null) {
                    OutputStream openOutputStream2 = contentResolver.openOutputStream(insert2);
                    byte[] bArr = new byte[8388608];
                    if (openOutputStream2 != null) {
                        try {
                            try {
                                for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                                    openOutputStream2.write(bArr, 0, read);
                                }
                                openOutputStream2.close();
                            } finally {
                            }
                        } finally {
                        }
                    }
                    fileInputStream.close();
                }
                z2 = true;
            } catch (FileNotFoundException e4) {
                String message = e4.getMessage();
                if (message == null) {
                    message = e4.toString();
                }
                Log.e("GallerySaver", message);
                z2 = false;
                return Boolean.valueOf(z2);
            } catch (Exception e5) {
                String message2 = e5.getMessage();
                if (message2 == null) {
                    message2 = e5.toString();
                }
                Log.e("GallerySaver", message2);
                z2 = false;
                return Boolean.valueOf(z2);
            }
        } else {
            ContentResolver contentResolver2 = abstractActivityC0029e.getContentResolver();
            j.d(contentResolver2, "getContentResolver(...)");
            String str4 = c1110c.f9953d;
            String str5 = c1110c.f9954e;
            boolean z4 = c1110c.f;
            File file2 = new File(str4);
            String mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file2.toString()));
            int length = (int) file2.length();
            byte[] bArr2 = new byte[length];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
            try {
                bufferedInputStream.read(bArr2, 0, length);
                bufferedInputStream.close();
                String str6 = Environment.DIRECTORY_PICTURES;
                if (z4) {
                    str6 = Environment.DIRECTORY_DCIM;
                }
                String str7 = str6;
                try {
                    gVar = new g(str4);
                    c3 = gVar.c("Orientation");
                } catch (IOException e6) {
                    Log.d("FileUtils", e6.toString());
                }
                try {
                    try {
                        if (c3 != null) {
                            try {
                                e3 = c3.e(gVar.f1128h);
                            } catch (NumberFormatException unused2) {
                            }
                            if (e3 != 3) {
                                i3 = 180;
                            } else if (e3 != 6) {
                                if (e3 == 8) {
                                    i3 = 270;
                                }
                                i3 = 0;
                            } else {
                                i3 = 90;
                            }
                            if (i3 != 0) {
                                byteArray = null;
                            } else {
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, length);
                                Matrix matrix = new Matrix();
                                matrix.preRotate(i3);
                                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                                decodeByteArray.recycle();
                                j.b(createBitmap);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                byteArray = byteArrayOutputStream.toByteArray();
                                createBitmap.recycle();
                                j.b(byteArray);
                                createBitmap.recycle();
                            }
                            if (byteArray != null) {
                                bArr2 = byteArray;
                            }
                            String absolutePath2 = new File(new File(S0.a.l(str5, EnumC1112e.f9958a, z4)), file2.getName()).getAbsolutePath();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("title", file2.getName());
                            contentValues2.put("mime_type", mimeTypeFromExtension2);
                            long currentTimeMillis = System.currentTimeMillis();
                            long j3 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                            contentValues2.put("date_added", Long.valueOf(currentTimeMillis / j3));
                            contentValues2.put("date_modified", Long.valueOf(System.currentTimeMillis() / j3));
                            contentValues2.put("_display_name", file2.getName());
                            contentValues2.put("_size", Long.valueOf(file2.length()));
                            i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 29) {
                                contentValues2.put("_data", absolutePath2);
                            } else {
                                contentValues2.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                                contentValues2.put("relative_path", str7 + File.separator + str5);
                            }
                            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            insert = contentResolver2.insert(uri, contentValues2);
                            if (insert == null) {
                                try {
                                    openOutputStream = contentResolver2.openOutputStream(insert);
                                } catch (IOException unused3) {
                                    uri = insert;
                                    j.b(uri);
                                    contentResolver2.delete(uri, null, null);
                                    z2 = false;
                                    return Boolean.valueOf(z2);
                                }
                            } else {
                                openOutputStream = null;
                            }
                            if (openOutputStream != null) {
                                try {
                                    openOutputStream.write(bArr2);
                                    openOutputStream.close();
                                } finally {
                                }
                            }
                            if (insert != null || i4 >= 29) {
                                z = true;
                            } else {
                                long parseId = ContentUris.parseId(insert);
                                z = true;
                                Bitmap thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver2, parseId, 1, null);
                                j.b(thumbnail);
                                S0.a.H(contentResolver2, thumbnail, parseId);
                            }
                            z2 = z;
                        }
                        insert = contentResolver2.insert(uri, contentValues2);
                        if (insert == null) {
                        }
                        if (openOutputStream != null) {
                        }
                        if (insert != null) {
                        }
                        z = true;
                        z2 = z;
                    } catch (IOException unused4) {
                    }
                } catch (Throwable unused5) {
                    z2 = false;
                    return Boolean.valueOf(z2);
                }
                e3 = 1;
                if (e3 != 3) {
                }
                if (i3 != 0) {
                }
                if (byteArray != null) {
                }
                String absolutePath22 = new File(new File(S0.a.l(str5, EnumC1112e.f9958a, z4)), file2.getName()).getAbsolutePath();
                ContentValues contentValues22 = new ContentValues();
                contentValues22.put("title", file2.getName());
                contentValues22.put("mime_type", mimeTypeFromExtension2);
                long currentTimeMillis2 = System.currentTimeMillis();
                long j32 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                contentValues22.put("date_added", Long.valueOf(currentTimeMillis2 / j32));
                contentValues22.put("date_modified", Long.valueOf(System.currentTimeMillis() / j32));
                contentValues22.put("_display_name", file2.getName());
                contentValues22.put("_size", Long.valueOf(file2.length()));
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                }
                Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } finally {
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1108a) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
