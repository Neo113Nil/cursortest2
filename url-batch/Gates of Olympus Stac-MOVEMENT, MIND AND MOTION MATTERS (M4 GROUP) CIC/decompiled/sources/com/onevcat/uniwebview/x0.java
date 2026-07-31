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
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class x0 implements d0 {
    public final ValueCallback b;
    public final WebChromeClient.FileChooserParams c;
    public boolean d;
    public File e;
    public File f;
    public String g;
    public Context h;

    public x0(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
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

    @Override // com.onevcat.uniwebview.d0
    public final void a() {
    }

    @Override // com.onevcat.uniwebview.d0
    public final void a(Intent intent) {
    }

    @Override // com.onevcat.uniwebview.d0
    public final void b() {
        ValueCallback valueCallback;
        c0 c0Var = d0.a;
        String id = this.g;
        if (id == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            id = null;
        }
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        c0.b.remove(id);
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
        o oVar = o.b;
        String message = "copyInputStream uri: '" + uri + "' ToFile: " + file;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.VERBOSE, message);
        x0 x0Var = null;
        r2 = null;
        FileOutputStream fileOutputStream2 = null;
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
                        oVar.a(n.CRITICAL, message2);
                        return;
                    }
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                fileOutputStream.close();
                                fileOutputStream.close();
                                inputStream.close();
                                return;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        o oVar2 = o.b;
                        oVar2.getClass();
                        Intrinsics.checkNotNullParameter("copyInputStreamToFile ", "message");
                        oVar2.a(n.CRITICAL, "copyInputStreamToFile ");
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th3) {
                x0Var = this;
                th = th3;
                fileOutputStream = null;
                th = th;
                inputStream = x0Var;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
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
            th = th;
            inputStream = x0Var;
            if (fileOutputStream != null) {
            }
            if (inputStream != null) {
            }
            throw th;
        }
    }

    public final File a(int i) {
        String str;
        String str2;
        Context context = null;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i2 != 2) {
            str = BuildConfig.FLAVOR;
            str2 = BuildConfig.FLAVOR;
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        Context context2 = this.h;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context2;
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        o oVar = o.b;
        String message = t0.a("Trying to create file as: prefix: ", str, ", suffix: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.VERBOSE, message);
        File outputFile = File.createTempFile(str, str2, externalFilesDir);
        o oVar2 = o.b;
        String message2 = "Temp file created: " + outputFile;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        oVar2.a(n.VERBOSE, message2);
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
                    str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(StringsKt.replace$default(str2, ".", BuildConfig.FLAVOR, false, 4, (Object) null));
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

    /* JADX WARN: Code restructure failed: missing block: B:101:0x028f, code lost:
    
        if (r14 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x025f, code lost:
    
        if (r14 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0294, code lost:
    
        if (r3 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02c0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02c1, code lost:
    
        if (r0 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02c3, code lost:
    
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02c6, code lost:
    
        r15 = r15 + 1;
        r2 = r36;
        r14 = r37;
        r10 = r18;
        r13 = r19;
        r3 = r20;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0297, code lost:
    
        a(r0, r3);
        r0 = android.net.Uri.fromFile(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x029f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a0, code lost:
    
        r2 = com.onevcat.uniwebview.o.b;
        r0 = "Error while processStreamUri. " + r0.getMessage();
        r2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "message");
        r2.a(com.onevcat.uniwebview.n.CRITICAL, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0291, code lost:
    
        r14.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023e A[Catch: Exception -> 0x0274, all -> 0x02d8, TryCatch #4 {all -> 0x02d8, blocks: (B:81:0x0199, B:85:0x01a1, B:88:0x01ad, B:96:0x01cd, B:62:0x0219, B:64:0x023e, B:65:0x0242, B:91:0x01fc, B:93:0x0203, B:99:0x0274), top: B:80:0x0199 }] */
    @Override // com.onevcat.uniwebview.d0
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
        ValueCallback valueCallback;
        Uri[] uriArr2;
        Cursor cursor;
        ValueCallback valueCallback2;
        boolean z5;
        boolean z6;
        Cursor cursor2;
        File file4;
        String joinToString$default;
        Context context;
        Uri[] parseResult;
        Intrinsics.checkNotNullParameter(activity, "activity");
        o oVar = o.b;
        o oVar2 = o.b;
        String message = "handleResult. requestCode: " + i + ", resultCode: " + i2 + ", data: " + intent;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        n nVar = n.VERBOSE;
        oVar2.a(nVar, message);
        if (i != 19238467) {
            return;
        }
        if (this.b == null) {
            oVar2.getClass();
            Intrinsics.checkNotNullParameter("filePathCallback is null for some reason. Aborting...", "message");
            oVar2.a(n.CRITICAL, "filePathCallback is null for some reason. Aborting...");
            this.d = true;
            activity.finish();
            return;
        }
        File file5 = this.e;
        int i3 = 0;
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
                                oVar2.getClass();
                                Intrinsics.checkNotNullParameter("imageTaken detected. Callback with output image uri.", "message");
                                oVar2.a(nVar, "imageTaken detected. Callback with output image uri.");
                                ValueCallback valueCallback3 = this.b;
                                File file6 = this.e;
                                Intrinsics.checkNotNull(file6);
                                valueCallback3.onReceiveValue(new Uri[]{a(file6)});
                            } else if (z2) {
                                oVar2.getClass();
                                Intrinsics.checkNotNullParameter("videoTaken detected. Callback with output video uri.", "message");
                                oVar2.a(nVar, "videoTaken detected. Callback with output video uri.");
                                ValueCallback valueCallback4 = this.b;
                                File file7 = this.f;
                                Intrinsics.checkNotNull(file7);
                                valueCallback4.onReceiveValue(new Uri[]{a(file7)});
                            } else {
                                if (intent != null) {
                                    ClipData clipData = intent.getClipData();
                                    if (clipData != null) {
                                        ArrayList arrayList = new ArrayList();
                                        int itemCount = clipData.getItemCount();
                                        for (int i4 = 0; i4 < itemCount; i4++) {
                                            Uri item = clipData.getItemAt(i4).getUri();
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
                                    o oVar3 = o.b;
                                    o oVar4 = o.b;
                                    String message2 = "File picking detected. externalUris: " + uriArr + ". Start processing...";
                                    oVar4.getClass();
                                    Intrinsics.checkNotNullParameter(message2, "message");
                                    oVar4.a(n.VERBOSE, message2);
                                    ValueCallback valueCallback5 = this.b;
                                    if (uriArr == null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        int length = uriArr.length;
                                        int i5 = 0;
                                        while (i5 < length) {
                                            Uri uri = uriArr[i5];
                                            o oVar5 = o.b;
                                            String message3 = "processStreamUri: " + uri;
                                            oVar5.getClass();
                                            Intrinsics.checkNotNullParameter(message3, "message");
                                            n nVar2 = n.VERBOSE;
                                            oVar5.a(nVar2, message3);
                                            Uri[] uriArr3 = uriArr;
                                            int i6 = length;
                                            try {
                                                Context context2 = this.h;
                                                if (context2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("context");
                                                    context2 = null;
                                                }
                                                cursor2 = context2.getContentResolver().query(uri, null, null, null, null, null);
                                                String str = "tmp_file";
                                                String str2 = BuildConfig.FLAVOR;
                                                if (cursor2 != null) {
                                                    try {
                                                        try {
                                                            if (cursor2.moveToFirst()) {
                                                                z5 = z2;
                                                                try {
                                                                    String fullFileName = cursor2.getString(cursor2.getColumnIndexOrThrow("_display_name"));
                                                                    z6 = z;
                                                                    try {
                                                                        Intrinsics.checkNotNullExpressionValue(fullFileName, "fullFileName");
                                                                        List split$default = StringsKt.split$default((CharSequence) fullFileName, new String[]{"."}, false, 0, 6, (Object) null);
                                                                        valueCallback2 = valueCallback5;
                                                                        if (split$default.size() < 2) {
                                                                            if (split$default.size() == 1) {
                                                                                joinToString$default = (String) split$default.get(0);
                                                                            }
                                                                            String str3 = str;
                                                                            String str4 = str2;
                                                                            String message4 = "Creating temp file with name " + str3 + '.' + str4;
                                                                            Intrinsics.checkNotNullParameter(message4, "message");
                                                                            oVar5.a(nVar2, message4);
                                                                            context = this.h;
                                                                            if (context == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("context");
                                                                                context = null;
                                                                            }
                                                                            file4 = File.createTempFile(str3, str4, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                                                            String message5 = "File created: " + file4;
                                                                            Intrinsics.checkNotNullParameter(message5, "message");
                                                                            oVar5.a(nVar2, message5);
                                                                        } else {
                                                                            try {
                                                                                String str5 = "." + ((String) CollectionsKt.last(split$default));
                                                                                joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.dropLast(split$default, 1), ".", null, null, 0, null, null, 62, null);
                                                                                str2 = str5;
                                                                            } catch (Exception unused) {
                                                                                o oVar6 = o.b;
                                                                                String message6 = "Error while createChoosingTempFileBasedOn uri: " + uri;
                                                                                oVar6.getClass();
                                                                                Intrinsics.checkNotNullParameter(message6, "message");
                                                                                oVar6.a(n.CRITICAL, message6);
                                                                                file4 = null;
                                                                            }
                                                                        }
                                                                        str = joinToString$default;
                                                                        String str32 = str;
                                                                        String str42 = str2;
                                                                        String message42 = "Creating temp file with name " + str32 + '.' + str42;
                                                                        Intrinsics.checkNotNullParameter(message42, "message");
                                                                        oVar5.a(nVar2, message42);
                                                                        context = this.h;
                                                                        if (context == null) {
                                                                        }
                                                                        file4 = File.createTempFile(str32, str42, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                                                        String message52 = "File created: " + file4;
                                                                        Intrinsics.checkNotNullParameter(message52, "message");
                                                                        oVar5.a(nVar2, message52);
                                                                    } catch (Exception unused2) {
                                                                        valueCallback2 = valueCallback5;
                                                                    }
                                                                } catch (Exception unused3) {
                                                                    valueCallback2 = valueCallback5;
                                                                    z6 = z;
                                                                    o oVar62 = o.b;
                                                                    String message62 = "Error while createChoosingTempFileBasedOn uri: " + uri;
                                                                    oVar62.getClass();
                                                                    Intrinsics.checkNotNullParameter(message62, "message");
                                                                    oVar62.a(n.CRITICAL, message62);
                                                                    file4 = null;
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            cursor = cursor2;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused4) {
                                                        valueCallback2 = valueCallback5;
                                                        z5 = z2;
                                                    }
                                                }
                                                valueCallback2 = valueCallback5;
                                                z5 = z2;
                                                z6 = z;
                                                String str322 = str;
                                                String str422 = str2;
                                                String message422 = "Creating temp file with name " + str322 + '.' + str422;
                                                Intrinsics.checkNotNullParameter(message422, "message");
                                                oVar5.a(nVar2, message422);
                                                context = this.h;
                                                if (context == null) {
                                                }
                                                file4 = File.createTempFile(str322, str422, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                                String message522 = "File created: " + file4;
                                                Intrinsics.checkNotNullParameter(message522, "message");
                                                oVar5.a(nVar2, message522);
                                            } catch (Exception unused5) {
                                                valueCallback2 = valueCallback5;
                                                z5 = z2;
                                                z6 = z;
                                                cursor2 = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor = null;
                                            }
                                        }
                                        ValueCallback valueCallback6 = valueCallback5;
                                        z3 = z2;
                                        z4 = z;
                                        Object[] array2 = arrayList2.toArray(new Uri[i3]);
                                        if (array2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                        }
                                        uriArr2 = (Uri[]) array2;
                                        valueCallback = valueCallback6;
                                    } else {
                                        z3 = z2;
                                        z4 = z;
                                        valueCallback = valueCallback5;
                                        uriArr2 = null;
                                    }
                                    valueCallback.onReceiveValue(uriArr2);
                                }
                                uriArr = null;
                                o oVar32 = o.b;
                                o oVar42 = o.b;
                                String message22 = "File picking detected. externalUris: " + uriArr + ". Start processing...";
                                oVar42.getClass();
                                Intrinsics.checkNotNullParameter(message22, "message");
                                oVar42.a(n.VERBOSE, message22);
                                ValueCallback valueCallback52 = this.b;
                                if (uriArr == null) {
                                }
                                valueCallback.onReceiveValue(uriArr2);
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
    
        if (r13.getMode() == 1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    @Override // com.onevcat.uniwebview.d0
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
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Starting File Chooser...", "message");
        n nVar = n.VERBOSE;
        oVar.a(nVar, "Starting File Chooser...");
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
        oVar.a(nVar, message);
        ArrayList arrayList = new ArrayList();
        String[] a3 = a(acceptTypes);
        if (a(a3, "*/*") || a(a3, "image")) {
            Intrinsics.checkNotNullParameter("params contains image. Adding photo intent.", "message");
            oVar.a(nVar, "params contains image. Adding photo intent.");
            try {
                File a4 = a(2);
                a = a(a4);
                String message2 = "Output image uri: " + a;
                Intrinsics.checkNotNullParameter(message2, "message");
                oVar.a(nVar, message2);
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
                o oVar2 = o.b;
                String message3 = "getPhotoIntent errored (IOException). Cannot create the temp file. " + e;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(message3, "message");
                oVar2.a(n.CRITICAL, message3);
                e.printStackTrace();
                if (intent != null) {
                }
                a2 = a(acceptTypes);
                if (!a(a2, "*/*")) {
                }
                o oVar3 = o.b;
                oVar3.getClass();
                Intrinsics.checkNotNullParameter("params contains video. Adding video intent.", "message");
                n nVar2 = n.VERBOSE;
                oVar3.a(nVar2, "params contains video. Adding video intent.");
                try {
                    File a5 = a(3);
                    Uri a6 = a(a5);
                    String message4 = "Output video uri: " + a6;
                    Intrinsics.checkNotNullParameter(message4, "message");
                    oVar3.a(nVar2, message4);
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
                    o oVar4 = o.b;
                    String message5 = "getVideoIntent errored (IOException). Cannot create the temp file. " + e2;
                    oVar4.getClass();
                    Intrinsics.checkNotNullParameter(message5, "message");
                    oVar4.a(n.CRITICAL, message5);
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
            o oVar32 = o.b;
            oVar32.getClass();
            Intrinsics.checkNotNullParameter("params contains video. Adding video intent.", "message");
            n nVar22 = n.VERBOSE;
            oVar32.a(nVar22, "params contains video. Adding video intent.");
            File a52 = a(3);
            Uri a62 = a(a52);
            String message42 = "Output video uri: " + a62;
            Intrinsics.checkNotNullParameter(message42, "message");
            oVar32.a(nVar22, message42);
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
