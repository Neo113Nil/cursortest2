package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import e0.h0;
import e0.u;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d extends BaseInputConnection implements f {

    /* renamed from: a, reason: collision with root package name */
    public final u f430a;

    /* renamed from: b, reason: collision with root package name */
    public final int f431b;

    /* renamed from: c, reason: collision with root package name */
    public final c0.a f432c;

    /* renamed from: d, reason: collision with root package name */
    public final g f433d;

    /* renamed from: e, reason: collision with root package name */
    public final EditorInfo f434e;

    /* renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f435f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f436g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f437h;

    /* renamed from: i, reason: collision with root package name */
    public final ExtractedText f438i;

    /* renamed from: j, reason: collision with root package name */
    public final InputMethodManager f439j;

    /* renamed from: k, reason: collision with root package name */
    public final DynamicLayout f440k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.n f441l;
    public final h0 m;

    /* renamed from: n, reason: collision with root package name */
    public int f442n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u uVar, int i2, c0.a aVar, h0 h0Var, g gVar, EditorInfo editorInfo) {
        super(uVar, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f436g = false;
        this.f438i = new ExtractedText();
        this.f442n = 0;
        this.f430a = uVar;
        this.f431b = i2;
        this.f432c = aVar;
        this.f433d = gVar;
        gVar.a(this);
        this.f434e = editorInfo;
        this.m = h0Var;
        this.f441l = new androidx.lifecycle.n(6, flutterJNI);
        this.f440k = new DynamicLayout(gVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f439j = (InputMethodManager) uVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.f
    public final void a(boolean z2) {
        g gVar = this.f433d;
        gVar.getClass();
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar);
        InputMethodManager inputMethodManager = this.f439j;
        u uVar = this.f430a;
        inputMethodManager.updateSelection(uVar, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
        ExtractedTextRequest extractedTextRequest = this.f435f;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(uVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f436g) {
            inputMethodManager.updateCursorAnchorInfo(uVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f437h;
        if (builder == null) {
            this.f437h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f437h;
        g gVar = this.f433d;
        gVar.getClass();
        int selectionStart = Selection.getSelectionStart(gVar);
        gVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(gVar));
        gVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar);
        gVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f437h.setComposingText(-1, "");
        } else {
            this.f437h.setComposingText(composingSpanStart, gVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f437h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f433d.b();
        this.f442n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f438i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f433d;
        charSequence.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f433d.e(this);
        while (this.f442n > 0) {
            endBatchEdit();
            this.f442n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        ClipDescription description;
        Uri contentUri;
        ClipDescription description2;
        int i3;
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                description = inputContentInfo.getDescription();
                if (description.getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    contentUri = inputContentInfo.getContentUri();
                    description2 = inputContentInfo.getDescription();
                    String mimeType = description2.getMimeType(0);
                    Context context = this.f430a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i3 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i3 = -1;
                                    }
                                    if (i3 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        ((h0) this.f432c.f66c).d("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f431b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i3);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    public final boolean d(boolean z2, boolean z3) {
        int charCount;
        int charCount2;
        int charCount3;
        int charCount4;
        int min;
        int codePointBefore;
        int charCount5;
        int charCount6;
        int i2;
        int i3;
        int charCount7;
        g gVar = this.f433d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        int i4 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        androidx.lifecycle.n nVar = this.f441l;
        if (z2) {
            FlutterJNI flutterJNI = (FlutterJNI) nVar.f40c;
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = Character.charCount((codePointBefore = Character.codePointBefore(gVar, selectionEnd))))) != 0) {
                if (codePointBefore == 10) {
                    if (Character.codePointBefore(gVar, charCount6) == 13) {
                        charCount5++;
                    }
                } else if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                    int codePointBefore2 = Character.codePointBefore(gVar, charCount6);
                    int charCount8 = charCount6 - Character.charCount(codePointBefore2);
                    int i5 = 1;
                    while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                        codePointBefore2 = Character.codePointBefore(gVar, charCount8);
                        charCount8 -= Character.charCount(codePointBefore2);
                        i5++;
                    }
                    if (i5 % 2 == 0) {
                        charCount5 += 2;
                    }
                } else if (codePointBefore == 8419) {
                    int codePointBefore3 = Character.codePointBefore(gVar, charCount6);
                    int charCount9 = charCount6 - Character.charCount(codePointBefore3);
                    if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                        int codePointBefore4 = Character.codePointBefore(gVar, charCount9);
                        if (androidx.lifecycle.n.t(codePointBefore4)) {
                            charCount7 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                            charCount5 += charCount7;
                        }
                    } else if (androidx.lifecycle.n.t(codePointBefore3)) {
                        charCount7 = Character.charCount(codePointBefore3);
                        charCount5 += charCount7;
                    }
                } else {
                    if (codePointBefore == 917631) {
                        int codePointBefore5 = Character.codePointBefore(gVar, charCount6);
                        charCount6 -= Character.charCount(codePointBefore5);
                        codePointBefore = codePointBefore5;
                        while (charCount6 > 0 && 917536 <= codePointBefore && codePointBefore <= 917630) {
                            charCount5 += Character.charCount(codePointBefore);
                            codePointBefore = Character.codePointBefore(gVar, charCount6);
                            charCount6 -= Character.charCount(codePointBefore);
                        }
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            charCount5 += Character.charCount(codePointBefore);
                        } else {
                            i3 = selectionEnd - 2;
                        }
                    }
                    if (flutterJNI.isCodePointVariantSelector(codePointBefore)) {
                        codePointBefore = Character.codePointBefore(gVar, charCount6);
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            charCount5 += Character.charCount(codePointBefore);
                            charCount6 -= charCount5;
                        }
                    }
                    if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                        boolean z4 = false;
                        int i6 = 0;
                        while (true) {
                            if (z4) {
                                charCount5 = Character.charCount(codePointBefore) + i6 + 1 + charCount5;
                                z4 = false;
                            }
                            if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                int codePointBefore6 = Character.codePointBefore(gVar, charCount6);
                                int charCount10 = charCount6 - Character.charCount(codePointBefore6);
                                if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                    i2 = 0;
                                } else {
                                    codePointBefore6 = Character.codePointBefore(gVar, charCount10);
                                    if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                        i2 = Character.charCount(codePointBefore6);
                                        Character.charCount(codePointBefore6);
                                    }
                                }
                                if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                    charCount5 += Character.charCount(codePointBefore6) + i2;
                                }
                            } else {
                                if (charCount6 > 0) {
                                    int codePointBefore7 = Character.codePointBefore(gVar, charCount6);
                                    charCount6 -= Character.charCount(codePointBefore7);
                                    if (codePointBefore7 == 8205) {
                                        int codePointBefore8 = Character.codePointBefore(gVar, charCount6);
                                        charCount6 -= Character.charCount(codePointBefore8);
                                        if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                            i6 = 0;
                                        } else {
                                            codePointBefore8 = Character.codePointBefore(gVar, charCount6);
                                            i6 = Character.charCount(codePointBefore8);
                                            charCount6 -= Character.charCount(codePointBefore8);
                                        }
                                        codePointBefore = codePointBefore8;
                                        z4 = true;
                                        if (charCount6 != 0 || !z4 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        codePointBefore = codePointBefore7;
                                    }
                                }
                                i6 = 0;
                                if (charCount6 != 0) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i3 = selectionEnd - charCount5;
            } else {
                i3 = 0;
            }
            min = Math.max(i3, 0);
        } else {
            FlutterJNI flutterJNI2 = (FlutterJNI) nVar.f40c;
            int length = gVar.length();
            int i7 = length - 1;
            if (selectionEnd >= i7) {
                i4 = length;
            } else {
                int codePointAt = Character.codePointAt(gVar, selectionEnd);
                int charCount11 = Character.charCount(codePointAt);
                int i8 = selectionEnd + charCount11;
                if (i8 != 0) {
                    if (codePointAt == 10) {
                        if (Character.codePointAt(gVar, i8) == 13) {
                            charCount11++;
                        }
                    } else if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                        if (androidx.lifecycle.n.t(codePointAt)) {
                            charCount11 += Character.charCount(codePointAt);
                        }
                        if (codePointAt == 8419) {
                            int codePointBefore9 = Character.codePointBefore(gVar, i8);
                            int charCount12 = Character.charCount(codePointBefore9) + i8;
                            if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                int codePointAt2 = Character.codePointAt(gVar, charCount12);
                                if (androidx.lifecycle.n.t(codePointAt2)) {
                                    charCount2 = Character.charCount(codePointBefore9);
                                    charCount3 = Character.charCount(codePointAt2);
                                    charCount11 += charCount3 + charCount2;
                                }
                            } else if (androidx.lifecycle.n.t(codePointBefore9)) {
                                charCount = Character.charCount(codePointBefore9);
                                charCount11 += charCount;
                            }
                        } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                            boolean z5 = false;
                            int i9 = 0;
                            while (true) {
                                if (z5) {
                                    charCount11 = Character.charCount(codePointAt) + i9 + 1 + charCount11;
                                    z5 = false;
                                }
                                if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                    break;
                                }
                                if (i8 < length) {
                                    int codePointAt3 = Character.codePointAt(gVar, i8);
                                    int charCount13 = Character.charCount(codePointAt3) + i8;
                                    if (codePointAt3 == 8419) {
                                        int codePointBefore10 = Character.codePointBefore(gVar, charCount13);
                                        int charCount14 = Character.charCount(codePointBefore10) + charCount13;
                                        if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                            int codePointAt4 = Character.codePointAt(gVar, charCount14);
                                            if (androidx.lifecycle.n.t(codePointAt4)) {
                                                charCount2 = Character.charCount(codePointBefore10);
                                                charCount3 = Character.charCount(codePointAt4);
                                            }
                                        } else if (androidx.lifecycle.n.t(codePointBefore10)) {
                                            charCount = Character.charCount(codePointBefore10);
                                        }
                                    } else {
                                        if (flutterJNI2.isCodePointEmojiModifier(codePointAt3)) {
                                            charCount4 = Character.charCount(codePointAt3);
                                            break;
                                        }
                                        if (flutterJNI2.isCodePointVariantSelector(codePointAt3)) {
                                            charCount4 = Character.charCount(codePointAt3);
                                            break;
                                        }
                                        if (codePointAt3 == 8205) {
                                            int codePointAt5 = Character.codePointAt(gVar, charCount13);
                                            int charCount15 = Character.charCount(codePointAt5) + charCount13;
                                            if (charCount15 < length && flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                int codePointAt6 = Character.codePointAt(gVar, charCount15);
                                                int charCount16 = Character.charCount(codePointAt6);
                                                int charCount17 = Character.charCount(codePointAt6) + charCount15;
                                                i9 = charCount16;
                                                i8 = charCount17;
                                                codePointAt = codePointAt6;
                                                z5 = true;
                                                if (i8 < length || !z5 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt5;
                                                i8 = charCount15;
                                                z5 = true;
                                            }
                                        } else {
                                            codePointAt = codePointAt3;
                                            i8 = charCount13;
                                        }
                                    }
                                }
                                i9 = 0;
                                if (i8 < length) {
                                    break;
                                    break;
                                }
                            }
                            charCount11 += charCount4;
                        }
                    } else if (i8 >= i7 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(gVar, i8))) {
                        i4 = i8;
                    } else {
                        int i10 = selectionEnd;
                        while (i10 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(gVar, selectionEnd))) {
                            i10 -= Character.charCount(Character.codePointBefore(gVar, selectionEnd));
                            i4++;
                        }
                        if (i4 % 2 == 0) {
                            charCount11 += 2;
                        }
                    }
                    i4 = selectionEnd + charCount11;
                }
            }
            min = Math.min(i4, gVar.length());
        }
        if (selectionStart != selectionEnd || z3) {
            setSelection(selectionStart, min);
            return true;
        }
        setSelection(min, min);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        g gVar = this.f433d;
        gVar.getClass();
        if (Selection.getSelectionStart(gVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i2, i3);
    }

    public final boolean e(boolean z2, boolean z3) {
        g gVar = this.f433d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        boolean z4 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z3) {
            z4 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f440k;
        if (z4) {
            if (z2) {
                Selection.moveUp(gVar, dynamicLayout);
            } else {
                Selection.moveDown(gVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(gVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z2) {
                Selection.extendUp(gVar, dynamicLayout);
            } else {
                Selection.extendDown(gVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f442n--;
        this.f433d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f433d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        this.f435f = (i2 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        beginBatchEdit();
        boolean z2 = true;
        g gVar = this.f433d;
        if (i2 == 16908319) {
            setSelection(0, gVar.length());
        } else {
            u uVar = this.f430a;
            if (i2 == 16908320) {
                int selectionStart = Selection.getSelectionStart(gVar);
                int selectionEnd = Selection.getSelectionEnd(gVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) uVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(min, max)));
                    gVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i2 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(gVar);
                int selectionEnd2 = Selection.getSelectionEnd(gVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) uVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i2 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) uVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(uVar.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(gVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(gVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        gVar.delete(min2, max4);
                    }
                    gVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z2 = false;
            }
        }
        endBatchEdit();
        return z2;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        c0.a aVar = this.f432c;
        int i3 = this.f431b;
        if (i2 == 0) {
            ((h0) aVar.f66c).d("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.unspecified"), null);
            return true;
        }
        if (i2 == 1) {
            ((h0) aVar.f66c).d("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.newline"), null);
            return true;
        }
        if (i2 == 2) {
            ((h0) aVar.f66c).d("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.go"), null);
            return true;
        }
        if (i2 == 3) {
            ((h0) aVar.f66c).d("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.search"), null);
            return true;
        }
        if (i2 == 4) {
            ((h0) aVar.f66c).d("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.send"), null);
            return true;
        }
        if (i2 == 5) {
            ((h0) aVar.f66c).d("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.next"), null);
            return true;
        }
        if (i2 != 7) {
            ((h0) aVar.f66c).d("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.done"), null);
            return true;
        }
        ((h0) aVar.f66c).d("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.previous"), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        c0.a aVar = this.f432c;
        aVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        ((h0) aVar.f66c).d("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f431b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        if ((i2 & 1) != 0) {
            this.f439j.updateCursorAnchorInfo(this.f430a, b());
        }
        this.f436g = (i2 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.m.c(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i2) : super.setComposingText(charSequence, i2);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i3) {
        beginBatchEdit();
        boolean selection = super.setSelection(i2, i3);
        endBatchEdit();
        return selection;
    }
}
