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
import com.onevcat.uniwebview.internal.obfuscated.A;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0035c;
import com.onevcat.uniwebview.internal.obfuscated.B;
import com.onevcat.uniwebview.internal.obfuscated.L;
import com.onevcat.uniwebview.internal.obfuscated.P;
import com.onevcat.uniwebview.internal.obfuscated.Q;
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
public final class e implements Q {
    public final ValueCallback b;
    public final WebChromeClient.FileChooserParams c;
    public boolean d;
    public File e;
    public File f;
    public String g;
    public Context h;

    public e(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.b = valueCallback;
        this.c = fileChooserParams;
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
    public final void a() {
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
    public final void a(Intent intent) {
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
    public final void b() {
        ValueCallback valueCallback;
        P p = Q.a;
        String id = this.g;
        if (id == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            id = null;
        }
        p.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        P.b.remove(id);
        if (this.d || (valueCallback = this.b) == null) {
            return;
        }
        valueCallback.onReceiveValue(new Uri[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x024d, code lost:
    
        if (r15 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0284, code lost:
    
        if (r0 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02b0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02b1, code lost:
    
        if (r0 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02b3, code lost:
    
        r5.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02b6, code lost:
    
        r14 = r14 + 1;
        r2 = r37;
        r9 = r18;
        r10 = r19;
        r13 = r20;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0287, code lost:
    
        a(r6, r0);
        r0 = android.net.Uri.fromFile(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x028f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0290, code lost:
    
        r2 = com.onevcat.uniwebview.internal.obfuscated.B.b;
        r0 = "Error while processStreamUri. " + r0.getMessage();
        r2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "message");
        r2.a(com.onevcat.uniwebview.internal.obfuscated.A.CRITICAL, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0281, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x027f, code lost:
    
        if (r15 == null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022c A[Catch: Exception -> 0x0264, all -> 0x02c6, TryCatch #3 {all -> 0x02c6, blocks: (B:79:0x0189, B:83:0x0191, B:86:0x019d, B:94:0x01c0, B:60:0x0207, B:62:0x022c, B:63:0x0230, B:89:0x01ef, B:91:0x01f6, B:97:0x0264), top: B:78:0x0189 }] */
    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
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
        int i3;
        boolean z5;
        boolean z6;
        Uri uri;
        Cursor cursor2;
        File file4;
        String joinToString$default;
        Context context;
        Uri[] parseResult;
        Intrinsics.checkNotNullParameter(activity, "activity");
        B b = B.b;
        String message = "handleResult. requestCode: " + i + ", resultCode: " + i2 + ", data: " + intent;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        A a = A.VERBOSE;
        b.a(a, message);
        if (i != 19238467) {
            return;
        }
        if (this.b == null) {
            Intrinsics.checkNotNullParameter("filePathCallback is null for some reason. Aborting...", "message");
            b.a(A.CRITICAL, "filePathCallback is null for some reason. Aborting...");
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
                                Intrinsics.checkNotNullParameter("imageTaken detected. Callback with output image uri.", "message");
                                b.a(a, "imageTaken detected. Callback with output image uri.");
                                ValueCallback valueCallback = this.b;
                                File file6 = this.e;
                                Intrinsics.checkNotNull(file6);
                                valueCallback.onReceiveValue(new Uri[]{a(file6)});
                            } else if (z2) {
                                Intrinsics.checkNotNullParameter("videoTaken detected. Callback with output video uri.", "message");
                                b.a(a, "videoTaken detected. Callback with output video uri.");
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
                                        parseResult = (Uri[]) arrayList.toArray(new Uri[0]);
                                    } else if (intent.getData() != null && i2 == -1) {
                                        parseResult = WebChromeClient.FileChooserParams.parseResult(i2, intent);
                                    }
                                    uriArr = parseResult;
                                    B b2 = B.b;
                                    String message2 = "File picking detected. externalUris: " + uriArr + ". Start processing...";
                                    b2.getClass();
                                    Intrinsics.checkNotNullParameter(message2, "message");
                                    b2.a(A.VERBOSE, message2);
                                    ValueCallback valueCallback3 = this.b;
                                    if (uriArr == null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        int length = uriArr.length;
                                        int i6 = 0;
                                        while (i6 < length) {
                                            Uri uri2 = uriArr[i6];
                                            B b3 = B.b;
                                            int i7 = i4;
                                            String message3 = "processStreamUri: " + uri2;
                                            b3.getClass();
                                            Intrinsics.checkNotNullParameter(message3, "message");
                                            A a2 = A.VERBOSE;
                                            b3.a(a2, message3);
                                            Uri[] uriArr3 = uriArr;
                                            try {
                                                Context context2 = this.h;
                                                if (context2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("context");
                                                    context2 = null;
                                                }
                                                cursor2 = context2.getContentResolver().query(uri2, null, null, null, null, null);
                                                uri = uri2;
                                                String str = "tmp_file";
                                                String str2 = "";
                                                if (cursor2 != null) {
                                                    try {
                                                        try {
                                                            if (cursor2.moveToFirst()) {
                                                                i3 = length;
                                                                try {
                                                                    String fullFileName = cursor2.getString(cursor2.getColumnIndexOrThrow("_display_name"));
                                                                    z5 = z2;
                                                                    try {
                                                                        Intrinsics.checkNotNullExpressionValue(fullFileName, "fullFileName");
                                                                        String[] strArr = new String[1];
                                                                        strArr[i7] = ".";
                                                                        List split$default = StringsKt.split$default((CharSequence) fullFileName, strArr, false, 0, 6, (Object) null);
                                                                        z6 = z;
                                                                        if (split$default.size() >= 2) {
                                                                            try {
                                                                                String str3 = "." + ((String) CollectionsKt.last(split$default));
                                                                                joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.dropLast(split$default, 1), ".", null, null, 0, null, null, 62, null);
                                                                                str2 = str3;
                                                                            } catch (Exception unused) {
                                                                                B b4 = B.b;
                                                                                String message4 = "Error while createChoosingTempFileBasedOn uri: " + uri;
                                                                                b4.getClass();
                                                                                Intrinsics.checkNotNullParameter(message4, "message");
                                                                                b4.a(A.CRITICAL, message4);
                                                                                file4 = null;
                                                                            }
                                                                        } else {
                                                                            if (split$default.size() == 1) {
                                                                                joinToString$default = (String) split$default.get(i7);
                                                                            }
                                                                            String str4 = str;
                                                                            String str5 = str2;
                                                                            String message5 = "Creating temp file with name " + str4 + '.' + str5;
                                                                            Intrinsics.checkNotNullParameter(message5, "message");
                                                                            b3.a(a2, message5);
                                                                            context = this.h;
                                                                            if (context == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("context");
                                                                                context = null;
                                                                            }
                                                                            file4 = File.createTempFile(str4, str5, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                                                            String message6 = "File created: " + file4;
                                                                            Intrinsics.checkNotNullParameter(message6, "message");
                                                                            b3.a(a2, message6);
                                                                        }
                                                                        str = joinToString$default;
                                                                        String str42 = str;
                                                                        String str52 = str2;
                                                                        String message52 = "Creating temp file with name " + str42 + '.' + str52;
                                                                        Intrinsics.checkNotNullParameter(message52, "message");
                                                                        b3.a(a2, message52);
                                                                        context = this.h;
                                                                        if (context == null) {
                                                                        }
                                                                        file4 = File.createTempFile(str42, str52, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                                                        String message62 = "File created: " + file4;
                                                                        Intrinsics.checkNotNullParameter(message62, "message");
                                                                        b3.a(a2, message62);
                                                                    } catch (Exception unused2) {
                                                                        z6 = z;
                                                                        B b42 = B.b;
                                                                        String message42 = "Error while createChoosingTempFileBasedOn uri: " + uri;
                                                                        b42.getClass();
                                                                        Intrinsics.checkNotNullParameter(message42, "message");
                                                                        b42.a(A.CRITICAL, message42);
                                                                        file4 = null;
                                                                    }
                                                                } catch (Exception unused3) {
                                                                    z5 = z2;
                                                                    z6 = z;
                                                                    B b422 = B.b;
                                                                    String message422 = "Error while createChoosingTempFileBasedOn uri: " + uri;
                                                                    b422.getClass();
                                                                    Intrinsics.checkNotNullParameter(message422, "message");
                                                                    b422.a(A.CRITICAL, message422);
                                                                    file4 = null;
                                                                }
                                                            }
                                                        } catch (Exception unused4) {
                                                            i3 = length;
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        cursor = cursor2;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i3 = length;
                                                z5 = z2;
                                                z6 = z;
                                                String str422 = str;
                                                String str522 = str2;
                                                String message522 = "Creating temp file with name " + str422 + '.' + str522;
                                                Intrinsics.checkNotNullParameter(message522, "message");
                                                b3.a(a2, message522);
                                                context = this.h;
                                                if (context == null) {
                                                }
                                                file4 = File.createTempFile(str422, str522, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                                String message622 = "File created: " + file4;
                                                Intrinsics.checkNotNullParameter(message622, "message");
                                                b3.a(a2, message622);
                                            } catch (Exception unused5) {
                                                i3 = length;
                                                z5 = z2;
                                                z6 = z;
                                                uri = uri2;
                                                cursor2 = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor = null;
                                            }
                                        }
                                        z3 = z2;
                                        z4 = z;
                                        uriArr2 = (Uri[]) arrayList2.toArray(new Uri[i4]);
                                    } else {
                                        z3 = z2;
                                        z4 = z;
                                        uriArr2 = null;
                                    }
                                    valueCallback3.onReceiveValue(uriArr2);
                                }
                                uriArr = null;
                                B b22 = B.b;
                                String message22 = "File picking detected. externalUris: " + uriArr + ". Start processing...";
                                b22.getClass();
                                Intrinsics.checkNotNullParameter(message22, "message");
                                b22.a(A.VERBOSE, message22);
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
    
        if (r13.getMode() == 1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    @Override // com.onevcat.uniwebview.internal.obfuscated.Q
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
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Starting File Chooser...", "message");
        A a3 = A.VERBOSE;
        b.a(a3, "Starting File Chooser...");
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
        b.a(a3, message);
        ArrayList arrayList = new ArrayList();
        String[] a4 = a(acceptTypes);
        if (a(a4, "*/*") || a(a4, "image")) {
            Intrinsics.checkNotNullParameter("params contains image. Adding photo intent.", "message");
            b.a(a3, "params contains image. Adding photo intent.");
            try {
                File a5 = a(2);
                a = a(a5);
                String message2 = "Output image uri: " + a;
                Intrinsics.checkNotNullParameter(message2, "message");
                b.a(a3, message2);
                this.e = a5;
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
            } catch (Exception e3) {
                e = e3;
                intent = null;
            }
            try {
                intent.putExtra("output", a);
            } catch (Exception e4) {
                e = e4;
                B b2 = B.b;
                String message3 = "getPhotoIntent errored (IOException). Cannot create the temp file. " + e;
                b2.getClass();
                Intrinsics.checkNotNullParameter(message3, "message");
                b2.a(A.CRITICAL, message3);
                e.printStackTrace();
                if (intent != null) {
                }
                a2 = a(acceptTypes);
                if (!a(a2, "*/*")) {
                }
                B b3 = B.b;
                b3.getClass();
                Intrinsics.checkNotNullParameter("params contains video. Adding video intent.", "message");
                A a6 = A.VERBOSE;
                b3.a(a6, "params contains video. Adding video intent.");
                try {
                    File a7 = a(3);
                    Uri a8 = a(a7);
                    String message4 = "Output video uri: " + a8;
                    Intrinsics.checkNotNullParameter(message4, "message");
                    b3.a(a6, message4);
                    this.f = a7;
                    intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                } catch (Exception e5) {
                    e2 = e5;
                }
                try {
                    intent2.putExtra("output", a8);
                } catch (Exception e6) {
                    e2 = e6;
                    intent3 = intent2;
                    B b4 = B.b;
                    String message5 = "getVideoIntent errored (IOException). Cannot create the temp file. " + e2;
                    b4.getClass();
                    Intrinsics.checkNotNullParameter(message5, "message");
                    b4.a(A.CRITICAL, message5);
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
            B b32 = B.b;
            b32.getClass();
            Intrinsics.checkNotNullParameter("params contains video. Adding video intent.", "message");
            A a62 = A.VERBOSE;
            b32.a(a62, "params contains video. Adding video intent.");
            File a72 = a(3);
            Uri a82 = a(a72);
            String message42 = "Output video uri: " + a82;
            Intrinsics.checkNotNullParameter(message42, "message");
            b32.a(a62, message42);
            this.f = a72;
            intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
            intent2.putExtra("output", a82);
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

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 != null && StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
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
            return (String[]) arrayList.toArray(new String[0]);
        }
        return new String[]{"*/*"};
    }

    public final File a(int i) {
        String str;
        String str2;
        int a = AbstractC0035c.a(i);
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
        B b = B.b;
        String message = L.a("Trying to create file as: prefix: ", str, ", suffix: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.VERBOSE, message);
        File outputFile = File.createTempFile(str, str2, externalFilesDir);
        B b2 = B.b;
        String message2 = "Temp file created: " + outputFile;
        b2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        b2.a(A.VERBOSE, message2);
        Intrinsics.checkNotNullExpressionValue(outputFile, "outputFile");
        return outputFile;
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
        B b = B.b;
        String message = "copyInputStream uri: '" + uri + "' ToFile: " + file;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.VERBOSE, message);
        e eVar = null;
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
                        b.a(A.CRITICAL, message2);
                        return;
                    }
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read > 0) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                fileOutputStream.close();
                                fileOutputStream.close();
                                inputStream.close();
                                return;
                            }
                        }
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        B b2 = B.b;
                        b2.getClass();
                        Intrinsics.checkNotNullParameter("copyInputStreamToFile ", "message");
                        b2.a(A.CRITICAL, "copyInputStreamToFile ");
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
                eVar = this;
                th = th3;
                fileOutputStream = null;
                th = th;
                inputStream = eVar;
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
            inputStream = eVar;
            if (fileOutputStream != null) {
            }
            if (inputStream != null) {
            }
            throw th;
        }
    }
}
