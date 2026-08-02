package net.idrnd.face.iad.capture.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.ImageFormat;
import net.idrnd.face.iad.capture.NativeImageProcessor;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.lexer.MarkdownLexer;
import org.intellij.markdown.lexer.TokenInfo;

/* loaded from: classes9.dex */
public final class p0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public p0(MarkdownLexer markdownLexer) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            MarkdownElementType markdownElementType = markdownLexer.f1631type;
            if (markdownElementType == null) {
                break;
            }
            boolean equals = markdownElementType.equals(MarkdownTokenTypes.WHITE_SPACE);
            TokenInfo tokenInfo = new TokenInfo(markdownLexer.f1631type, markdownLexer.tokenStart, markdownLexer.tokenEnd, arrayList.size(), equals ? -1 : arrayList2.size());
            arrayList.add(tokenInfo);
            if (!equals) {
                arrayList2.add(tokenInfo);
            }
            MarkdownElementType markdownElementType2 = markdownLexer.nextType;
            markdownLexer.f1631type = markdownElementType2;
            markdownLexer.tokenStart = markdownLexer.tokenEnd;
            if (markdownElementType2 != null) {
                markdownLexer.calcNextType();
            }
        }
        this.a = arrayList;
        this.b = arrayList2;
        this.c = markdownLexer.originalText;
        this.d = RangesKt___RangesKt.until(markdownLexer.bufferStart, markdownLexer.bufferEnd);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((TokenInfo) arrayList.get(i)).rawIndex != i) {
                throw new MarkdownParsingException("");
            }
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((TokenInfo) arrayList2.get(i2)).normIndex != i2) {
                throw new MarkdownParsingException("");
            }
        }
    }

    public q a(f3 f3Var) {
        Bitmap bitmap;
        Object obj;
        byte[] byteArray;
        int i = f3Var.b;
        int i2 = f3Var.c;
        int[] iArr = new int[i * i2];
        NativeImageProcessor.a.convertNv21ToArgb(f3Var.a.a, i, i2, iArr);
        synchronized (this.c) {
            a aVar = (a) this.d;
            int i3 = f3Var.b;
            int i4 = f3Var.c;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            aVar.getClass();
            config.getClass();
            ArrayList arrayList = aVar.a;
            Iterator it = arrayList.iterator();
            while (true) {
                bitmap = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2.getWidth() == i3 && bitmap2.getHeight() == i4 && bitmap2.getConfig() == config) {
                    break;
                }
            }
            Bitmap bitmap3 = (Bitmap) obj;
            if (bitmap3 != null) {
                arrayList.remove(bitmap3);
                bitmap = bitmap3;
            }
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(i3, i4, config);
                bitmap.getClass();
            }
            int i5 = f3Var.b;
            Bitmap bitmap4 = bitmap;
            bitmap4.setPixels(iArr, 0, i5, 0, 0, i5, f3Var.c);
            synchronized (this.b) {
                ((ByteArrayOutputStream) this.a).reset();
                bitmap4.compress(Bitmap.CompressFormat.PNG, 100, (ByteArrayOutputStream) this.a);
                a aVar2 = (a) this.d;
                aVar2.getClass();
                aVar2.a.add(bitmap4);
                byteArray = ((ByteArrayOutputStream) this.a).toByteArray();
            }
        }
        ImageFormat imageFormat = ImageFormat.PNG;
        byteArray.getClass();
        return new q(imageFormat, byteArray, new Size(f3Var.b, f3Var.c), f3Var.d, System.currentTimeMillis());
    }

    public char getRawCharAt(int i) {
        IntRange intRange = (IntRange) this.d;
        if (i >= intRange.first && i <= intRange.last) {
            return ((CharSequence) this.c).charAt(i);
        }
        return (char) 0;
    }

    public p0() {
        this.a = new ByteArrayOutputStream();
        this.b = new Object();
        this.c = new Object();
        this.d = new a();
    }

    public p0(Context context, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, NavigationStateManager navigationStateManager) {
        context.getClass();
        cameraXController_Factory_Impl.getClass();
        camera2Controller_Factory_Impl.getClass();
        navigationStateManager.getClass();
        this.a = context;
        this.b = cameraXController_Factory_Impl;
        this.c = camera2Controller_Factory_Impl;
        this.d = navigationStateManager;
    }

    public byte[] a(f3 f3Var, int i, Rect rect) {
        YuvImage yuvImage;
        byte[] byteArray;
        synchronized (f3Var.e) {
            byte[] bArr = null;
            yuvImage = null;
            if (!f3Var.c()) {
                d3 d3Var = f3Var.a;
                synchronized (d3Var.d) {
                    if (!d3Var.c) {
                        bArr = NativeImageProcessor.a.copyToJavaByteArray(d3Var.a, d3Var.b);
                    }
                }
                yuvImage = new YuvImage(bArr, 17, f3Var.b, f3Var.c, null);
            }
        }
        yuvImage.getClass();
        if (rect == null) {
            rect = new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight());
        }
        synchronized (this.b) {
            ((ByteArrayOutputStream) this.a).reset();
            if (yuvImage.compressToJpeg(rect, i, (ByteArrayOutputStream) this.a)) {
                byteArray = ((ByteArrayOutputStream) this.a).toByteArray();
                byteArray.getClass();
            } else {
                throw new b3("Failed to compress YuvImage to JPEG.");
            }
        }
        return byteArray;
    }

    public q a(f3 f3Var, MatchResult.Destructured destructured, int i) {
        if (i <= 100 && i >= 0) {
            return new q(ImageFormat.JPEG, a(f3Var, i, (Rect) null), new Size(f3Var.b, f3Var.c), destructured, System.currentTimeMillis());
        }
        a$$ExternalSyntheticBUOutline0.m$3("JPEG quality can't be above 100 and below 0");
        return null;
    }
}
