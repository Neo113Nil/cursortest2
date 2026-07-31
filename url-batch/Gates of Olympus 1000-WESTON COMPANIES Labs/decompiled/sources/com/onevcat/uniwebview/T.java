package com.onevcat.uniwebview;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class T implements InterfaceC0101y {
    public final ValueCallback b;
    public final WebChromeClient.FileChooserParams c;
    public boolean d;
    public File e;
    public File f;
    public String g;
    public Context h;

    public T(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.b = valueCallback;
        this.c = fileChooserParams;
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 != null && StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.onevcat.uniwebview.InterfaceC0101y
    public final void a() {
    }

    @Override // com.onevcat.uniwebview.InterfaceC0101y
    public final void a(Intent intent) {
    }

    @Override // com.onevcat.uniwebview.InterfaceC0101y
    public final void b() {
        ValueCallback valueCallback;
        C0098x c0098x = InterfaceC0101y.a;
        String id = this.g;
        if (id == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            id = null;
        }
        c0098x.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        C0098x.b.remove(id);
        if (this.d || (valueCallback = this.b) == null) {
            return;
        }
        valueCallback.onReceiveValue(new Uri[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Uri uri, File file) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        Throwable th;
        FileOutputStream fileOutputStream2;
        C0060l c0060l = C0060l.b;
        String message = "copyInputStream uri: '" + uri + "' ToFile: " + file;
        c0060l.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0057k enumC0057k = EnumC0057k.VERBOSE;
        c0060l.a(enumC0057k, message);
        EnumC0057k enumC0057k2 = null;
        r2 = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            try {
                Context context = this.h;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                inputStream = context.getContentResolver().openInputStream(uri);
                try {
                    if (inputStream == null) {
                        String message2 = "Empty input stream with uri: " + uri + ". Aborting...";
                        Intrinsics.checkNotNullParameter(message2, "message");
                        c0060l.a(EnumC0057k.CRITICAL, message2);
                        return;
                    }
                    fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                fileOutputStream2.close();
                                fileOutputStream2.close();
                                inputStream.close();
                                return;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        }
                    } catch (Exception unused) {
                        fileOutputStream3 = fileOutputStream2;
                        C0060l c0060l2 = C0060l.b;
                        c0060l2.getClass();
                        Intrinsics.checkNotNullParameter("copyInputStreamToFile ", "message");
                        c0060l2.a(EnumC0057k.CRITICAL, "copyInputStreamToFile ");
                        if (fileOutputStream3 != null) {
                            fileOutputStream3.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                enumC0057k2 = enumC0057k;
                FileOutputStream fileOutputStream4 = fileOutputStream;
                th = th;
                fileOutputStream2 = fileOutputStream4;
                inputStream = enumC0057k2;
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Exception unused3) {
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            FileOutputStream fileOutputStream42 = fileOutputStream;
            th = th;
            fileOutputStream2 = fileOutputStream42;
            inputStream = enumC0057k2;
            if (fileOutputStream2 != null) {
            }
            if (inputStream != null) {
            }
            throw th;
        }
    }

    public final File a(int i) {
        String str;
        String str2;
        int a = AbstractC0033c.a(i);
        if (a == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (a != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        Context context = this.h;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        C0060l c0060l = C0060l.b;
        String message = O.a("Trying to create file as: prefix: ", str, ", suffix: ", str2, c0060l);
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(EnumC0057k.VERBOSE, message);
        File outputFile = File.createTempFile(str, str2, externalFilesDir);
        C0060l c0060l2 = C0060l.b;
        String message2 = "Temp file created: " + outputFile;
        c0060l2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c0060l2.a(EnumC0057k.VERBOSE, message2);
        Intrinsics.checkNotNullExpressionValue(outputFile, "outputFile");
        return outputFile;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0.length() == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] a(String[] strArr) {
        String str;
        if (strArr.length != 0) {
            if (strArr.length == 1 && (str = strArr[0]) != null) {
                Intrinsics.checkNotNull(str);
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                if (str2 != null && new Regex("\\.\\w+").matches(str2)) {
                    str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(StringsKt.replace$default(str2, ".", "", false, 4, (Object) null));
                }
                arrayList.add(str2);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return new String[]{"*/*"};
    }

    public final Uri a(File file) {
        Context context = this.h;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        Context context3 = this.h;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context2 = context3;
        }
        Uri uriForFile = FileProvider.getUriForFile(context2, packageName + ".uniwebview_fileprovider", file);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(context, \"…eprovider\", capturedFile)");
        return uriForFile;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0322 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x032e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0243 A[Catch: all -> 0x0269, Exception -> 0x0278, TryCatch #1 {Exception -> 0x0278, blocks: (B:98:0x01d4, B:63:0x021e, B:65:0x0243, B:66:0x0247, B:93:0x0203, B:95:0x020a), top: B:97:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.onevcat.uniwebview.InterfaceC0101y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(UniWebViewProxyActivity activity, int i, int i2, Intent intent) {
        boolean z;
        File file;
        boolean z2;
        boolean z3;
        boolean z4;
        File file2;
        File file3;
        Uri[] uriArr;
        Uri[] uriArr2;
        Cursor cursor;
        boolean z5;
        boolean z6;
        int i3;
        Uri uri;
        Cursor cursor2;
        File file4;
        Cursor cursor3;
        Uri fromFile;
        Cursor query;
        String str;
        String str2;
        Cursor cursor4;
        List split$default;
        String joinToString$default;
        Context context;
        Uri[] parseResult;
        Intrinsics.checkNotNullParameter(activity, "activity");
        C0060l c0060l = C0060l.b;
        C0060l c0060l2 = C0060l.b;
        String message = "handleResult. requestCode: " + i + ", resultCode: " + i2 + ", data: " + intent;
        c0060l2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0057k enumC0057k = EnumC0057k.VERBOSE;
        c0060l2.a(enumC0057k, message);
        if (i != 19238467) {
            return;
        }
        if (this.b == null) {
            c0060l2.getClass();
            Intrinsics.checkNotNullParameter("filePathCallback is null for some reason. Aborting...", "message");
            c0060l2.a(EnumC0057k.CRITICAL, "filePathCallback is null for some reason. Aborting...");
            this.d = true;
            activity.finish();
            return;
        }
        File file5 = this.e;
        int i4 = 0;
        if (file5 != null) {
            Intrinsics.checkNotNull(file5);
            if (file5.length() > 0) {
                z = true;
                file = this.f;
                if (file != null) {
                    Intrinsics.checkNotNull(file);
                    if (file.length() > 0) {
                        z2 = true;
                        if (i2 == -1) {
                            if (z) {
                                c0060l2.getClass();
                                Intrinsics.checkNotNullParameter("imageTaken detected. Callback with output image uri.", "message");
                                c0060l2.a(enumC0057k, "imageTaken detected. Callback with output image uri.");
                                ValueCallback valueCallback = this.b;
                                File file6 = this.e;
                                Intrinsics.checkNotNull(file6);
                                valueCallback.onReceiveValue(new Uri[]{a(file6)});
                            } else if (z2) {
                                c0060l2.getClass();
                                Intrinsics.checkNotNullParameter("videoTaken detected. Callback with output video uri.", "message");
                                c0060l2.a(enumC0057k, "videoTaken detected. Callback with output video uri.");
                                ValueCallback valueCallback2 = this.b;
                                File file7 = this.f;
                                Intrinsics.checkNotNull(file7);
                                valueCallback2.onReceiveValue(new Uri[]{a(file7)});
                            } else {
                                if (intent != null) {
                                    ClipData clipData = intent.getClipData();
                                    if (clipData != null) {
                                        ArrayList arrayList = new ArrayList();
                                        int itemCount = clipData.getItemCount();
                                        for (int i5 = 0; i5 < itemCount; i5++) {
                                            Uri item = clipData.getItemAt(i5).getUri();
                                            Intrinsics.checkNotNullExpressionValue(item, "item");
                                            arrayList.add(item);
                                        }
                                        Object[] array = arrayList.toArray(new Uri[0]);
                                        if (array == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                        }
                                        parseResult = (Uri[]) array;
                                    } else if (intent.getData() != null && i2 == -1) {
                                        parseResult = WebChromeClient.FileChooserParams.parseResult(i2, intent);
                                    }
                                    uriArr = parseResult;
                                    C0060l c0060l3 = C0060l.b;
                                    C0060l c0060l4 = C0060l.b;
                                    String message2 = "File picking detected. externalUris: " + uriArr + ". Start processing...";
                                    c0060l4.getClass();
                                    Intrinsics.checkNotNullParameter(message2, "message");
                                    c0060l4.a(EnumC0057k.VERBOSE, message2);
                                    ValueCallback valueCallback3 = this.b;
                                    if (uriArr == null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        int length = uriArr.length;
                                        int i6 = 0;
                                        while (i6 < length) {
                                            Uri uri2 = uriArr[i6];
                                            C0060l c0060l5 = C0060l.b;
                                            int i7 = i4;
                                            String message3 = "processStreamUri: " + uri2;
                                            c0060l5.getClass();
                                            Intrinsics.checkNotNullParameter(message3, "message");
                                            EnumC0057k enumC0057k2 = EnumC0057k.VERBOSE;
                                            c0060l5.a(enumC0057k2, message3);
                                            Uri[] uriArr3 = uriArr;
                                            try {
                                                Context context2 = this.h;
                                                if (context2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("context");
                                                    context2 = null;
                                                }
                                                query = context2.getContentResolver().query(uri2, null, null, null, null, null);
                                                z5 = z2;
                                                uri = uri2;
                                                str = "tmp_file";
                                                str2 = "";
                                            } catch (Exception unused) {
                                                z5 = z2;
                                                z6 = z;
                                                i3 = length;
                                                uri = uri2;
                                                cursor2 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = null;
                                            }
                                            if (query != null) {
                                                try {
                                                    try {
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        cursor4 = query;
                                                    }
                                                } catch (Exception unused2) {
                                                    cursor4 = query;
                                                    z6 = z;
                                                }
                                                if (query.moveToFirst()) {
                                                    z6 = z;
                                                    try {
                                                        String fullFileName = query.getString(query.getColumnIndexOrThrow("_display_name"));
                                                        cursor4 = query;
                                                        try {
                                                            try {
                                                                Intrinsics.checkNotNullExpressionValue(fullFileName, "fullFileName");
                                                                String[] strArr = new String[1];
                                                                strArr[i7] = ".";
                                                                split$default = StringsKt.split$default((CharSequence) fullFileName, strArr, false, 0, 6, (Object) null);
                                                                i3 = length;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                cursor = cursor4;
                                                                if (cursor != null) {
                                                                    cursor.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Exception unused3) {
                                                            i3 = length;
                                                            cursor2 = cursor4;
                                                            try {
                                                                C0060l c0060l6 = C0060l.b;
                                                                String message4 = "Error while createChoosingTempFileBasedOn uri: " + uri;
                                                                c0060l6.getClass();
                                                                Intrinsics.checkNotNullParameter(message4, "message");
                                                                c0060l6.a(EnumC0057k.CRITICAL, message4);
                                                                if (cursor2 == null) {
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                cursor = cursor2;
                                                                if (cursor != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Exception unused4) {
                                                        cursor4 = query;
                                                    }
                                                    if (split$default.size() < 2) {
                                                        if (split$default.size() == 1) {
                                                            joinToString$default = (String) split$default.get(i7);
                                                        }
                                                        String str3 = str;
                                                        String str4 = str2;
                                                        String message5 = "Creating temp file with name " + str3 + '.' + str4;
                                                        Intrinsics.checkNotNullParameter(message5, "message");
                                                        c0060l5.a(enumC0057k2, message5);
                                                        context = this.h;
                                                        if (context == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                                            context = null;
                                                        }
                                                        file4 = File.createTempFile(str3, str4, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                                        String message6 = "File created: " + file4;
                                                        Intrinsics.checkNotNullParameter(message6, "message");
                                                        c0060l5.a(enumC0057k2, message6);
                                                        if (cursor4 != null) {
                                                            cursor3 = cursor4;
                                                            cursor3.close();
                                                        }
                                                        if (file4 != null) {
                                                            try {
                                                                a(uri, file4);
                                                                fromFile = Uri.fromFile(file4);
                                                            } catch (Exception e) {
                                                                C0060l c0060l7 = C0060l.b;
                                                                String message7 = "Error while processStreamUri. " + e.getMessage();
                                                                c0060l7.getClass();
                                                                Intrinsics.checkNotNullParameter(message7, "message");
                                                                c0060l7.a(EnumC0057k.CRITICAL, message7);
                                                            }
                                                            if (fromFile == null) {
                                                                arrayList2.add(fromFile);
                                                            }
                                                            i6++;
                                                            uriArr = uriArr3;
                                                            z2 = z5;
                                                            z = z6;
                                                            length = i3;
                                                            i4 = 0;
                                                        }
                                                        fromFile = null;
                                                        if (fromFile == null) {
                                                        }
                                                        i6++;
                                                        uriArr = uriArr3;
                                                        z2 = z5;
                                                        z = z6;
                                                        length = i3;
                                                        i4 = 0;
                                                    } else {
                                                        try {
                                                            String str5 = "." + ((String) CollectionsKt.last(split$default));
                                                            joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.dropLast(split$default, 1), ".", null, null, 0, null, null, 62, null);
                                                            str2 = str5;
                                                        } catch (Exception unused5) {
                                                            cursor2 = cursor4;
                                                            C0060l c0060l62 = C0060l.b;
                                                            String message42 = "Error while createChoosingTempFileBasedOn uri: " + uri;
                                                            c0060l62.getClass();
                                                            Intrinsics.checkNotNullParameter(message42, "message");
                                                            c0060l62.a(EnumC0057k.CRITICAL, message42);
                                                            if (cursor2 == null) {
                                                                cursor3 = cursor2;
                                                                file4 = null;
                                                                cursor3.close();
                                                                if (file4 != null) {
                                                                }
                                                                fromFile = null;
                                                                if (fromFile == null) {
                                                                }
                                                                i6++;
                                                                uriArr = uriArr3;
                                                                z2 = z5;
                                                                z = z6;
                                                                length = i3;
                                                                i4 = 0;
                                                            } else {
                                                                file4 = null;
                                                                if (file4 != null) {
                                                                }
                                                                fromFile = null;
                                                                if (fromFile == null) {
                                                                }
                                                                i6++;
                                                                uriArr = uriArr3;
                                                                z2 = z5;
                                                                z = z6;
                                                                length = i3;
                                                                i4 = 0;
                                                            }
                                                        }
                                                    }
                                                    str = joinToString$default;
                                                    String str32 = str;
                                                    String str42 = str2;
                                                    String message52 = "Creating temp file with name " + str32 + '.' + str42;
                                                    Intrinsics.checkNotNullParameter(message52, "message");
                                                    c0060l5.a(enumC0057k2, message52);
                                                    context = this.h;
                                                    if (context == null) {
                                                    }
                                                    file4 = File.createTempFile(str32, str42, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                                    String message62 = "File created: " + file4;
                                                    Intrinsics.checkNotNullParameter(message62, "message");
                                                    c0060l5.a(enumC0057k2, message62);
                                                    if (cursor4 != null) {
                                                    }
                                                    if (file4 != null) {
                                                    }
                                                    fromFile = null;
                                                    if (fromFile == null) {
                                                    }
                                                    i6++;
                                                    uriArr = uriArr3;
                                                    z2 = z5;
                                                    z = z6;
                                                    length = i3;
                                                    i4 = 0;
                                                }
                                            }
                                            cursor4 = query;
                                            z6 = z;
                                            i3 = length;
                                            String str322 = str;
                                            String str422 = str2;
                                            String message522 = "Creating temp file with name " + str322 + '.' + str422;
                                            Intrinsics.checkNotNullParameter(message522, "message");
                                            c0060l5.a(enumC0057k2, message522);
                                            context = this.h;
                                            if (context == null) {
                                            }
                                            file4 = File.createTempFile(str322, str422, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                            String message622 = "File created: " + file4;
                                            Intrinsics.checkNotNullParameter(message622, "message");
                                            c0060l5.a(enumC0057k2, message622);
                                            if (cursor4 != null) {
                                            }
                                            if (file4 != null) {
                                            }
                                            fromFile = null;
                                            if (fromFile == null) {
                                            }
                                            i6++;
                                            uriArr = uriArr3;
                                            z2 = z5;
                                            z = z6;
                                            length = i3;
                                            i4 = 0;
                                        }
                                        z3 = z2;
                                        z4 = z;
                                        Object[] array2 = arrayList2.toArray(new Uri[i4]);
                                        if (array2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                        }
                                        uriArr2 = (Uri[]) array2;
                                    } else {
                                        z3 = z2;
                                        z4 = z;
                                        uriArr2 = null;
                                    }
                                    valueCallback3.onReceiveValue(uriArr2);
                                }
                                uriArr = null;
                                C0060l c0060l32 = C0060l.b;
                                C0060l c0060l42 = C0060l.b;
                                String message22 = "File picking detected. externalUris: " + uriArr + ". Start processing...";
                                c0060l42.getClass();
                                Intrinsics.checkNotNullParameter(message22, "message");
                                c0060l42.a(EnumC0057k.VERBOSE, message22);
                                ValueCallback valueCallback32 = this.b;
                                if (uriArr == null) {
                                }
                                valueCallback32.onReceiveValue(uriArr2);
                            }
                            z3 = z2;
                            z4 = z;
                        } else {
                            z3 = z2;
                            z4 = z;
                            this.b.onReceiveValue(null);
                        }
                        file2 = this.e;
                        if (file2 != null && !z4) {
                            Intrinsics.checkNotNull(file2);
                            file2.delete();
                        }
                        file3 = this.f;
                        if (file3 != null && !z3) {
                            Intrinsics.checkNotNull(file3);
                            file3.delete();
                        }
                        this.e = null;
                        this.f = null;
                        this.d = true;
                        activity.finish();
                    }
                }
                z2 = false;
                if (i2 == -1) {
                }
                file2 = this.e;
                if (file2 != null) {
                    Intrinsics.checkNotNull(file2);
                    file2.delete();
                }
                file3 = this.f;
                if (file3 != null) {
                    Intrinsics.checkNotNull(file3);
                    file3.delete();
                }
                this.e = null;
                this.f = null;
                this.d = true;
                activity.finish();
            }
        }
        z = false;
        file = this.f;
        if (file != null) {
        }
        z2 = false;
        if (i2 == -1) {
        }
        file2 = this.e;
        if (file2 != null) {
        }
        file3 = this.f;
        if (file3 != null) {
        }
        this.e = null;
        this.f = null;
        this.d = true;
        activity.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x013b, code lost:
    
        if (r0.getMode() == 1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    @Override // com.onevcat.uniwebview.InterfaceC0101y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(UniWebViewProxyActivity activity) {
        Exception e;
        Intent intent;
        Uri a;
        String[] a2;
        Exception e2;
        Intent intent2;
        WebChromeClient.FileChooserParams fileChooserParams;
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "activity");
        C0060l c0060l = C0060l.b;
        c0060l.getClass();
        Intrinsics.checkNotNullParameter("Starting File Chooser...", "message");
        EnumC0057k enumC0057k = EnumC0057k.VERBOSE;
        c0060l.a(enumC0057k, "Starting File Chooser...");
        WebChromeClient.FileChooserParams fileChooserParams2 = this.c;
        Intent intent3 = null;
        String[] acceptTypes = fileChooserParams2 != null ? fileChooserParams2.getAcceptTypes() : null;
        if (acceptTypes == null) {
            acceptTypes = new String[0];
        }
        StringBuilder sb = new StringBuilder("Accept types from file chooser params: ");
        WebChromeClient.FileChooserParams fileChooserParams3 = this.c;
        String message = sb.append(fileChooserParams3 != null ? fileChooserParams3.getAcceptTypes() : null).toString();
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(enumC0057k, message);
        ArrayList arrayList = new ArrayList();
        String[] a3 = a(acceptTypes);
        if (a(a3, "*/*") || a(a3, "image")) {
            Intrinsics.checkNotNullParameter("params contains image. Adding photo intent.", "message");
            c0060l.a(enumC0057k, "params contains image. Adding photo intent.");
            try {
                File a4 = a(2);
                a = a(a4);
                String message2 = "Output image uri: " + a;
                Intrinsics.checkNotNullParameter(message2, "message");
                c0060l.a(enumC0057k, message2);
                this.e = a4;
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
            } catch (Exception e3) {
                e = e3;
                intent = null;
            }
            try {
                intent.putExtra("output", a);
            } catch (Exception e4) {
                e = e4;
                C0060l c0060l2 = C0060l.b;
                String message3 = "getPhotoIntent errored (IOException). Cannot create the temp file. " + e;
                c0060l2.getClass();
                Intrinsics.checkNotNullParameter(message3, "message");
                c0060l2.a(EnumC0057k.CRITICAL, message3);
                e.printStackTrace();
                if (intent != null) {
                }
                a2 = a(acceptTypes);
                if (!a(a2, "*/*")) {
                }
                C0060l c0060l3 = C0060l.b;
                c0060l3.getClass();
                Intrinsics.checkNotNullParameter("params contains video. Adding video intent.", "message");
                EnumC0057k enumC0057k2 = EnumC0057k.VERBOSE;
                c0060l3.a(enumC0057k2, "params contains video. Adding video intent.");
                try {
                    File a5 = a(3);
                    Uri a6 = a(a5);
                    String message4 = "Output video uri: " + a6;
                    Intrinsics.checkNotNullParameter(message4, "message");
                    c0060l3.a(enumC0057k2, message4);
                    this.f = a5;
                    intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                } catch (Exception e5) {
                    e2 = e5;
                }
                try {
                    intent2.putExtra("output", a6);
                } catch (Exception e6) {
                    e2 = e6;
                    intent3 = intent2;
                    C0060l c0060l4 = C0060l.b;
                    String message5 = "getVideoIntent errored (IOException). Cannot create the temp file. " + e2;
                    c0060l4.getClass();
                    Intrinsics.checkNotNullParameter(message5, "message");
                    c0060l4.a(EnumC0057k.CRITICAL, message5);
                    e2.printStackTrace();
                    intent2 = intent3;
                    if (intent2 != null) {
                    }
                    fileChooserParams = this.c;
                    if (fileChooserParams != null) {
                    }
                    z = false;
                    Intent intent4 = new Intent("android.intent.action.GET_CONTENT");
                    intent4.addCategory("android.intent.category.OPENABLE");
                    intent4.setType("*/*");
                    intent4.putExtra("android.intent.extra.MIME_TYPES", a(acceptTypes));
                    intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
                    Intent intent5 = new Intent("android.intent.action.CHOOSER");
                    intent5.putExtra("android.intent.extra.TITLE", activity.getResources().getString(R.string.CHOOSE_IMAGE));
                    intent5.putExtra("android.intent.extra.INTENT", intent4);
                    intent5.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                    activity.startActivityForResult(intent5, 19238467);
                }
                if (intent2 != null) {
                }
                fileChooserParams = this.c;
                if (fileChooserParams != null) {
                }
                z = false;
                Intent intent42 = new Intent("android.intent.action.GET_CONTENT");
                intent42.addCategory("android.intent.category.OPENABLE");
                intent42.setType("*/*");
                intent42.putExtra("android.intent.extra.MIME_TYPES", a(acceptTypes));
                intent42.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
                Intent intent52 = new Intent("android.intent.action.CHOOSER");
                intent52.putExtra("android.intent.extra.TITLE", activity.getResources().getString(R.string.CHOOSE_IMAGE));
                intent52.putExtra("android.intent.extra.INTENT", intent42);
                intent52.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                activity.startActivityForResult(intent52, 19238467);
            }
            if (intent != null) {
                arrayList.add(intent);
            }
        }
        a2 = a(acceptTypes);
        if (!a(a2, "*/*") || a(a2, "video")) {
            C0060l c0060l32 = C0060l.b;
            c0060l32.getClass();
            Intrinsics.checkNotNullParameter("params contains video. Adding video intent.", "message");
            EnumC0057k enumC0057k22 = EnumC0057k.VERBOSE;
            c0060l32.a(enumC0057k22, "params contains video. Adding video intent.");
            File a52 = a(3);
            Uri a62 = a(a52);
            String message42 = "Output video uri: " + a62;
            Intrinsics.checkNotNullParameter(message42, "message");
            c0060l32.a(enumC0057k22, message42);
            this.f = a52;
            intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
            intent2.putExtra("output", a62);
            if (intent2 != null) {
                arrayList.add(intent2);
            }
        }
        fileChooserParams = this.c;
        if (fileChooserParams != null) {
            z = true;
        }
        z = false;
        Intent intent422 = new Intent("android.intent.action.GET_CONTENT");
        intent422.addCategory("android.intent.category.OPENABLE");
        intent422.setType("*/*");
        intent422.putExtra("android.intent.extra.MIME_TYPES", a(acceptTypes));
        intent422.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        Intent intent522 = new Intent("android.intent.action.CHOOSER");
        intent522.putExtra("android.intent.extra.TITLE", activity.getResources().getString(R.string.CHOOSE_IMAGE));
        intent522.putExtra("android.intent.extra.INTENT", intent422);
        intent522.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        activity.startActivityForResult(intent522, 19238467);
    }
}
