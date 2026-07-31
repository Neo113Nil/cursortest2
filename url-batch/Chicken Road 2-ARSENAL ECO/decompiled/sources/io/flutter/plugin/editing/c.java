package io.flutter.plugin.editing;

import D3.t;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
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
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import u0.C0675e;

/* loaded from: classes.dex */
public final class c extends BaseInputConnection implements e {

    /* renamed from: a, reason: collision with root package name */
    public final t f4494a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4495b;

    /* renamed from: c, reason: collision with root package name */
    public final C0675e f4496c;

    /* renamed from: d, reason: collision with root package name */
    public final f f4497d;

    /* renamed from: e, reason: collision with root package name */
    public final EditorInfo f4498e;

    /* renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f4499f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4500g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f4501h;

    /* renamed from: i, reason: collision with root package name */
    public final ExtractedText f4502i;

    /* renamed from: j, reason: collision with root package name */
    public final InputMethodManager f4503j;

    /* renamed from: k, reason: collision with root package name */
    public final DynamicLayout f4504k;

    /* renamed from: l, reason: collision with root package name */
    public final a6.d f4505l;

    /* renamed from: m, reason: collision with root package name */
    public final B0.c f4506m;

    /* renamed from: n, reason: collision with root package name */
    public int f4507n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, int i7, C0675e c0675e, B0.c cVar, f fVar, EditorInfo editorInfo) {
        super(tVar, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f4500g = false;
        this.f4502i = new ExtractedText();
        this.f4507n = 0;
        this.f4494a = tVar;
        this.f4495b = i7;
        this.f4496c = c0675e;
        this.f4497d = fVar;
        fVar.a(this);
        this.f4498e = editorInfo;
        this.f4506m = cVar;
        this.f4505l = new a6.d(flutterJNI);
        this.f4504k = new DynamicLayout(fVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f4503j = (InputMethodManager) tVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.e
    public final void a(boolean z5) {
        f fVar = this.f4497d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        InputMethodManager inputMethodManager = this.f4503j;
        t tVar = this.f4494a;
        inputMethodManager.updateSelection(tVar, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
        ExtractedTextRequest extractedTextRequest = this.f4499f;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(tVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f4500g) {
            inputMethodManager.updateCursorAnchorInfo(tVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f4501h;
        if (builder == null) {
            this.f4501h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f4501h;
        f fVar = this.f4497d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        fVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(fVar));
        fVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        fVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f4501h.setComposingText(-1, "");
        } else {
            this.f4501h.setComposingText(composingSpanStart, fVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f4501h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f4497d.b();
        this.f4507n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f4502i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f4497d;
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
        this.f4497d.e(this);
        while (this.f4507n > 0) {
            endBatchEdit();
            this.f4507n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        int i8;
        if ((i7 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f4494a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i8 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i8 = -1;
                                    }
                                    if (i8 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        ((B0.c) this.f4496c.f5975b).q("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f4495b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i8);
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

    public final boolean d(boolean z5, boolean z6) {
        int charCount;
        int charCount2;
        int charCount3;
        int charCount4;
        int min;
        int codePointBefore;
        int charCount5;
        int charCount6;
        int i7;
        int i8;
        int charCount7;
        f fVar = this.f4497d;
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        int i9 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        a6.d dVar = this.f4505l;
        if (z5) {
            FlutterJNI flutterJNI = (FlutterJNI) dVar.f3172f;
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = Character.charCount((codePointBefore = Character.codePointBefore(fVar, selectionEnd))))) != 0) {
                if (codePointBefore == 10) {
                    if (Character.codePointBefore(fVar, charCount6) == 13) {
                        charCount5++;
                    }
                } else if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                    int codePointBefore2 = Character.codePointBefore(fVar, charCount6);
                    int charCount8 = charCount6 - Character.charCount(codePointBefore2);
                    int i10 = 1;
                    while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                        codePointBefore2 = Character.codePointBefore(fVar, charCount8);
                        charCount8 -= Character.charCount(codePointBefore2);
                        i10++;
                    }
                    if (i10 % 2 == 0) {
                        charCount5 += 2;
                    }
                } else if (codePointBefore == 8419) {
                    int codePointBefore3 = Character.codePointBefore(fVar, charCount6);
                    int charCount9 = charCount6 - Character.charCount(codePointBefore3);
                    if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                        int codePointBefore4 = Character.codePointBefore(fVar, charCount9);
                        if (a6.d.f(codePointBefore4)) {
                            charCount7 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                            charCount5 += charCount7;
                        }
                    } else if (a6.d.f(codePointBefore3)) {
                        charCount7 = Character.charCount(codePointBefore3);
                        charCount5 += charCount7;
                    }
                } else {
                    if (codePointBefore == 917631) {
                        int codePointBefore5 = Character.codePointBefore(fVar, charCount6);
                        charCount6 -= Character.charCount(codePointBefore5);
                        codePointBefore = codePointBefore5;
                        while (charCount6 > 0 && 917536 <= codePointBefore && codePointBefore <= 917630) {
                            charCount5 += Character.charCount(codePointBefore);
                            codePointBefore = Character.codePointBefore(fVar, charCount6);
                            charCount6 -= Character.charCount(codePointBefore);
                        }
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            charCount5 += Character.charCount(codePointBefore);
                        } else {
                            i8 = selectionEnd - 2;
                        }
                    }
                    if (flutterJNI.isCodePointVariantSelector(codePointBefore)) {
                        codePointBefore = Character.codePointBefore(fVar, charCount6);
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            charCount5 += Character.charCount(codePointBefore);
                            charCount6 -= charCount5;
                        }
                    }
                    if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                        boolean z7 = false;
                        int i11 = 0;
                        while (true) {
                            if (z7) {
                                charCount5 = Character.charCount(codePointBefore) + i11 + 1 + charCount5;
                                z7 = false;
                            }
                            if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                int codePointBefore6 = Character.codePointBefore(fVar, charCount6);
                                int charCount10 = charCount6 - Character.charCount(codePointBefore6);
                                if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                    i7 = 0;
                                } else {
                                    codePointBefore6 = Character.codePointBefore(fVar, charCount10);
                                    if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                        i7 = Character.charCount(codePointBefore6);
                                        Character.charCount(codePointBefore6);
                                    }
                                }
                                if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                    charCount5 += Character.charCount(codePointBefore6) + i7;
                                }
                            } else {
                                if (charCount6 > 0) {
                                    int codePointBefore7 = Character.codePointBefore(fVar, charCount6);
                                    charCount6 -= Character.charCount(codePointBefore7);
                                    if (codePointBefore7 == 8205) {
                                        int codePointBefore8 = Character.codePointBefore(fVar, charCount6);
                                        charCount6 -= Character.charCount(codePointBefore8);
                                        if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                            i11 = 0;
                                        } else {
                                            codePointBefore8 = Character.codePointBefore(fVar, charCount6);
                                            i11 = Character.charCount(codePointBefore8);
                                            charCount6 -= Character.charCount(codePointBefore8);
                                        }
                                        codePointBefore = codePointBefore8;
                                        z7 = true;
                                        if (charCount6 != 0 || !z7 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        codePointBefore = codePointBefore7;
                                    }
                                }
                                i11 = 0;
                                if (charCount6 != 0) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i8 = selectionEnd - charCount5;
            } else {
                i8 = 0;
            }
            min = Math.max(i8, 0);
        } else {
            FlutterJNI flutterJNI2 = (FlutterJNI) dVar.f3172f;
            int length = fVar.length();
            int i12 = length - 1;
            if (selectionEnd >= i12) {
                i9 = length;
            } else {
                int codePointAt = Character.codePointAt(fVar, selectionEnd);
                int charCount11 = Character.charCount(codePointAt);
                int i13 = selectionEnd + charCount11;
                if (i13 != 0) {
                    if (codePointAt == 10) {
                        if (Character.codePointAt(fVar, i13) == 13) {
                            charCount11++;
                        }
                    } else if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                        if (a6.d.f(codePointAt)) {
                            charCount11 += Character.charCount(codePointAt);
                        }
                        if (codePointAt == 8419) {
                            int codePointBefore9 = Character.codePointBefore(fVar, i13);
                            int charCount12 = Character.charCount(codePointBefore9) + i13;
                            if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                int codePointAt2 = Character.codePointAt(fVar, charCount12);
                                if (a6.d.f(codePointAt2)) {
                                    charCount2 = Character.charCount(codePointBefore9);
                                    charCount3 = Character.charCount(codePointAt2);
                                    charCount11 += charCount3 + charCount2;
                                }
                            } else if (a6.d.f(codePointBefore9)) {
                                charCount = Character.charCount(codePointBefore9);
                                charCount11 += charCount;
                            }
                        } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                            boolean z8 = false;
                            int i14 = 0;
                            while (true) {
                                if (z8) {
                                    charCount11 = Character.charCount(codePointAt) + i14 + 1 + charCount11;
                                    z8 = false;
                                }
                                if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                    break;
                                }
                                if (i13 < length) {
                                    int codePointAt3 = Character.codePointAt(fVar, i13);
                                    int charCount13 = Character.charCount(codePointAt3) + i13;
                                    if (codePointAt3 == 8419) {
                                        int codePointBefore10 = Character.codePointBefore(fVar, charCount13);
                                        int charCount14 = Character.charCount(codePointBefore10) + charCount13;
                                        if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                            int codePointAt4 = Character.codePointAt(fVar, charCount14);
                                            if (a6.d.f(codePointAt4)) {
                                                charCount2 = Character.charCount(codePointBefore10);
                                                charCount3 = Character.charCount(codePointAt4);
                                            }
                                        } else if (a6.d.f(codePointBefore10)) {
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
                                            int codePointAt5 = Character.codePointAt(fVar, charCount13);
                                            int charCount15 = Character.charCount(codePointAt5) + charCount13;
                                            if (charCount15 < length && flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                int codePointAt6 = Character.codePointAt(fVar, charCount15);
                                                int charCount16 = Character.charCount(codePointAt6);
                                                int charCount17 = Character.charCount(codePointAt6) + charCount15;
                                                i14 = charCount16;
                                                i13 = charCount17;
                                                codePointAt = codePointAt6;
                                                z8 = true;
                                                if (i13 < length || !z8 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt5;
                                                i13 = charCount15;
                                                z8 = true;
                                            }
                                        } else {
                                            codePointAt = codePointAt3;
                                            i13 = charCount13;
                                        }
                                    }
                                }
                                i14 = 0;
                                if (i13 < length) {
                                    break;
                                    break;
                                }
                            }
                            charCount11 += charCount4;
                        }
                    } else if (i13 >= i12 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(fVar, i13))) {
                        i9 = i13;
                    } else {
                        int i15 = selectionEnd;
                        while (i15 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(fVar, selectionEnd))) {
                            i15 -= Character.charCount(Character.codePointBefore(fVar, selectionEnd));
                            i9++;
                        }
                        if (i9 % 2 == 0) {
                            charCount11 += 2;
                        }
                    }
                    i9 = selectionEnd + charCount11;
                }
            }
            min = Math.min(i9, fVar.length());
        }
        if (selectionStart != selectionEnd || z6) {
            setSelection(selectionStart, min);
            return true;
        }
        setSelection(min, min);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        f fVar = this.f4497d;
        fVar.getClass();
        if (Selection.getSelectionStart(fVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i7, i8);
    }

    public final boolean e(boolean z5, boolean z6) {
        f fVar = this.f4497d;
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        boolean z7 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z6) {
            z7 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f4504k;
        if (z7) {
            if (z5) {
                Selection.moveUp(fVar, dynamicLayout);
            } else {
                Selection.moveDown(fVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(fVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z5) {
                Selection.extendUp(fVar, dynamicLayout);
            } else {
                Selection.extendDown(fVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f4507n--;
        this.f4497d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f4497d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        this.f4499f = (i7 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        beginBatchEdit();
        boolean z5 = true;
        f fVar = this.f4497d;
        if (i7 == 16908319) {
            setSelection(0, fVar.length());
        } else {
            t tVar = this.f4494a;
            if (i7 == 16908320) {
                int selectionStart = Selection.getSelectionStart(fVar);
                int selectionEnd = Selection.getSelectionEnd(fVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) tVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(min, max)));
                    fVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i7 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(fVar);
                int selectionEnd2 = Selection.getSelectionEnd(fVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) tVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i7 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) tVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(tVar.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(fVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(fVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        fVar.delete(min2, max4);
                    }
                    fVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z5 = false;
            }
        }
        endBatchEdit();
        return z5;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        int i8 = this.f4495b;
        C0675e c0675e = this.f4496c;
        if (i7 == 0) {
            ((B0.c) c0675e.f5975b).q("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.unspecified"), null);
            return true;
        }
        if (i7 == 1) {
            ((B0.c) c0675e.f5975b).q("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.newline"), null);
            return true;
        }
        if (i7 == 2) {
            ((B0.c) c0675e.f5975b).q("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.go"), null);
            return true;
        }
        if (i7 == 3) {
            ((B0.c) c0675e.f5975b).q("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.search"), null);
            return true;
        }
        if (i7 == 4) {
            ((B0.c) c0675e.f5975b).q("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.send"), null);
            return true;
        }
        if (i7 == 5) {
            ((B0.c) c0675e.f5975b).q("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.next"), null);
            return true;
        }
        if (i7 != 7) {
            ((B0.c) c0675e.f5975b).q("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.done"), null);
            return true;
        }
        ((B0.c) c0675e.f5975b).q("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.previous"), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        C0675e c0675e = this.f4496c;
        c0675e.getClass();
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
        ((B0.c) c0675e.f5975b).q("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f4495b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        if ((i7 & 1) != 0) {
            this.f4503j.updateCursorAnchorInfo(this.f4494a, b());
        }
        this.f4500g = (i7 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f4506m.o(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i7) : super.setComposingText(charSequence, i7);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        beginBatchEdit();
        boolean selection = super.setSelection(i7, i8);
        endBatchEdit();
        return selection;
    }
}
