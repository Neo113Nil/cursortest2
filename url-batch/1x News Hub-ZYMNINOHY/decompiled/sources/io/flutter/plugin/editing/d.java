package io.flutter.plugin.editing;

import E1.t;
import P1.o;
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
import b0.s;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d extends BaseInputConnection implements f {

    /* renamed from: a, reason: collision with root package name */
    public final t f9177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9178b;

    /* renamed from: c, reason: collision with root package name */
    public final V0.e f9179c;

    /* renamed from: d, reason: collision with root package name */
    public final g f9180d;

    /* renamed from: e, reason: collision with root package name */
    public final EditorInfo f9181e;
    public ExtractedTextRequest f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9182g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f9183h;

    /* renamed from: i, reason: collision with root package name */
    public final ExtractedText f9184i;

    /* renamed from: j, reason: collision with root package name */
    public final InputMethodManager f9185j;

    /* renamed from: k, reason: collision with root package name */
    public final DynamicLayout f9186k;

    /* renamed from: l, reason: collision with root package name */
    public final s f9187l;

    /* renamed from: m, reason: collision with root package name */
    public final A0.f f9188m;

    /* renamed from: n, reason: collision with root package name */
    public int f9189n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, int i3, V0.e eVar, A0.f fVar, g gVar, EditorInfo editorInfo) {
        super(tVar, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f9182g = false;
        this.f9184i = new ExtractedText();
        this.f9189n = 0;
        this.f9177a = tVar;
        this.f9178b = i3;
        this.f9179c = eVar;
        this.f9180d = gVar;
        gVar.a(this);
        this.f9181e = editorInfo;
        this.f9188m = fVar;
        this.f9187l = new s(flutterJNI);
        this.f9186k = new DynamicLayout(gVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f9185j = (InputMethodManager) tVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.f
    public final void a(boolean z) {
        g gVar = this.f9180d;
        gVar.getClass();
        this.f9185j.updateSelection(this.f9177a, Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar), BaseInputConnection.getComposingSpanStart(gVar), BaseInputConnection.getComposingSpanEnd(gVar));
        ExtractedTextRequest extractedTextRequest = this.f;
        InputMethodManager inputMethodManager = this.f9185j;
        t tVar = this.f9177a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(tVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f9182g) {
            inputMethodManager.updateCursorAnchorInfo(tVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f9183h;
        if (builder == null) {
            this.f9183h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f9183h;
        g gVar = this.f9180d;
        gVar.getClass();
        int selectionStart = Selection.getSelectionStart(gVar);
        gVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(gVar));
        gVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar);
        gVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f9183h.setComposingText(-1, "");
        } else {
            this.f9183h.setComposingText(composingSpanStart, gVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f9183h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f9180d.b();
        this.f9189n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f9184i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f9180d;
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
        this.f9180d.e(this);
        while (this.f9189n > 0) {
            endBatchEdit();
            this.f9189n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        int i4;
        if ((i3 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f9177a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i4 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i4 = -1;
                                    }
                                    if (i4 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        V0.e eVar = this.f9179c;
                                        eVar.getClass();
                                        ((o) eVar.f1599b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f9178b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i4);
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

    public final boolean d(boolean z, boolean z2) {
        int charCount;
        int charCount2;
        int charCount3;
        int charCount4;
        int min;
        int codePointBefore;
        int charCount5;
        int charCount6;
        int i3;
        int i4;
        int charCount7;
        g gVar = this.f9180d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        int i5 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        s sVar = this.f9187l;
        if (z) {
            sVar.getClass();
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = Character.charCount((codePointBefore = Character.codePointBefore(gVar, selectionEnd))))) != 0) {
                if (codePointBefore != 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) sVar.f2544a;
                    if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                        int codePointBefore2 = Character.codePointBefore(gVar, charCount6);
                        int charCount8 = charCount6 - Character.charCount(codePointBefore2);
                        int i6 = 1;
                        while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                            codePointBefore2 = Character.codePointBefore(gVar, charCount8);
                            charCount8 -= Character.charCount(codePointBefore2);
                            i6++;
                        }
                        if (i6 % 2 == 0) {
                            charCount5 += 2;
                        }
                    } else if (codePointBefore == 8419) {
                        int codePointBefore3 = Character.codePointBefore(gVar, charCount6);
                        int charCount9 = charCount6 - Character.charCount(codePointBefore3);
                        if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                            int codePointBefore4 = Character.codePointBefore(gVar, charCount9);
                            if (s.f(codePointBefore4)) {
                                charCount7 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                                charCount5 += charCount7;
                            }
                        } else if (s.f(codePointBefore3)) {
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
                                i4 = selectionEnd - 2;
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
                            boolean z3 = false;
                            int i7 = 0;
                            while (true) {
                                if (z3) {
                                    charCount5 = Character.charCount(codePointBefore) + i7 + 1 + charCount5;
                                    z3 = false;
                                }
                                if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                    int codePointBefore6 = Character.codePointBefore(gVar, charCount6);
                                    int charCount10 = charCount6 - Character.charCount(codePointBefore6);
                                    if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                        i3 = 0;
                                    } else {
                                        codePointBefore6 = Character.codePointBefore(gVar, charCount10);
                                        if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                            i3 = Character.charCount(codePointBefore6);
                                            Character.charCount(codePointBefore6);
                                        }
                                    }
                                    if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                        charCount5 += Character.charCount(codePointBefore6) + i3;
                                    }
                                } else {
                                    if (charCount6 > 0) {
                                        int codePointBefore7 = Character.codePointBefore(gVar, charCount6);
                                        charCount6 -= Character.charCount(codePointBefore7);
                                        if (codePointBefore7 == 8205) {
                                            int codePointBefore8 = Character.codePointBefore(gVar, charCount6);
                                            charCount6 -= Character.charCount(codePointBefore8);
                                            if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                                i7 = 0;
                                            } else {
                                                codePointBefore8 = Character.codePointBefore(gVar, charCount6);
                                                i7 = Character.charCount(codePointBefore8);
                                                charCount6 -= Character.charCount(codePointBefore8);
                                            }
                                            codePointBefore = codePointBefore8;
                                            z3 = true;
                                            if (charCount6 != 0 || !z3 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            codePointBefore = codePointBefore7;
                                        }
                                    }
                                    i7 = 0;
                                    if (charCount6 != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (Character.codePointBefore(gVar, charCount6) == 13) {
                    charCount5++;
                }
                i4 = selectionEnd - charCount5;
            } else {
                i4 = 0;
            }
            min = Math.max(i4, 0);
        } else {
            sVar.getClass();
            int length = gVar.length();
            int i8 = length - 1;
            if (selectionEnd >= i8) {
                i5 = length;
            } else {
                int codePointAt = Character.codePointAt(gVar, selectionEnd);
                int charCount11 = Character.charCount(codePointAt);
                int i9 = selectionEnd + charCount11;
                if (i9 != 0) {
                    if (codePointAt != 10) {
                        FlutterJNI flutterJNI2 = (FlutterJNI) sVar.f2544a;
                        if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                            if (s.f(codePointAt)) {
                                charCount11 += Character.charCount(codePointAt);
                            }
                            if (codePointAt == 8419) {
                                int codePointBefore9 = Character.codePointBefore(gVar, i9);
                                int charCount12 = Character.charCount(codePointBefore9) + i9;
                                if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                    int codePointAt2 = Character.codePointAt(gVar, charCount12);
                                    if (s.f(codePointAt2)) {
                                        charCount2 = Character.charCount(codePointBefore9);
                                        charCount3 = Character.charCount(codePointAt2);
                                        charCount11 += charCount3 + charCount2;
                                    }
                                } else if (s.f(codePointBefore9)) {
                                    charCount = Character.charCount(codePointBefore9);
                                    charCount11 += charCount;
                                }
                            } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                                boolean z4 = false;
                                int i10 = 0;
                                while (true) {
                                    if (z4) {
                                        charCount11 = Character.charCount(codePointAt) + i10 + 1 + charCount11;
                                        z4 = false;
                                    }
                                    if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                        break;
                                    }
                                    if (i9 < length) {
                                        int codePointAt3 = Character.codePointAt(gVar, i9);
                                        int charCount13 = Character.charCount(codePointAt3) + i9;
                                        if (codePointAt3 == 8419) {
                                            int codePointBefore10 = Character.codePointBefore(gVar, charCount13);
                                            int charCount14 = Character.charCount(codePointBefore10) + charCount13;
                                            if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                                int codePointAt4 = Character.codePointAt(gVar, charCount14);
                                                if (s.f(codePointAt4)) {
                                                    charCount2 = Character.charCount(codePointBefore10);
                                                    charCount3 = Character.charCount(codePointAt4);
                                                }
                                            } else if (s.f(codePointBefore10)) {
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
                                                if (charCount15 >= length || !flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                    codePointAt = codePointAt5;
                                                    i9 = charCount15;
                                                    i10 = 0;
                                                } else {
                                                    int codePointAt6 = Character.codePointAt(gVar, charCount15);
                                                    int charCount16 = Character.charCount(codePointAt6);
                                                    int charCount17 = Character.charCount(codePointAt6) + charCount15;
                                                    i10 = charCount16;
                                                    i9 = charCount17;
                                                    codePointAt = codePointAt6;
                                                }
                                                z4 = true;
                                                if (i9 < length || !z4 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt3;
                                                i9 = charCount13;
                                            }
                                        }
                                    }
                                    i10 = 0;
                                    if (i9 < length) {
                                        break;
                                    }
                                }
                                charCount11 += charCount4;
                            }
                        } else if (i9 >= i8 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(gVar, i9))) {
                            i5 = i9;
                        } else {
                            int i11 = selectionEnd;
                            while (i11 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(gVar, selectionEnd))) {
                                i11 -= Character.charCount(Character.codePointBefore(gVar, selectionEnd));
                                i5++;
                            }
                            if (i5 % 2 == 0) {
                                charCount11 += 2;
                            }
                        }
                    } else if (Character.codePointAt(gVar, i9) == 13) {
                        charCount11++;
                    }
                    i5 = selectionEnd + charCount11;
                }
            }
            min = Math.min(i5, gVar.length());
        }
        if (selectionStart != selectionEnd || z2) {
            setSelection(selectionStart, min);
            return true;
        }
        setSelection(min, min);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        g gVar = this.f9180d;
        gVar.getClass();
        if (Selection.getSelectionStart(gVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i3, i4);
    }

    public final boolean e(boolean z, boolean z2) {
        g gVar = this.f9180d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f9186k;
        if (z3) {
            if (z) {
                Selection.moveUp(gVar, dynamicLayout);
            } else {
                Selection.moveDown(gVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(gVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z) {
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
        this.f9189n--;
        this.f9180d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f9180d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        this.f = (i3 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i3) {
        beginBatchEdit();
        boolean z = true;
        g gVar = this.f9180d;
        if (i3 == 16908319) {
            setSelection(0, gVar.length());
        } else {
            t tVar = this.f9177a;
            if (i3 == 16908320) {
                int selectionStart = Selection.getSelectionStart(gVar);
                int selectionEnd = Selection.getSelectionEnd(gVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) tVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(min, max)));
                    gVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i3 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(gVar);
                int selectionEnd2 = Selection.getSelectionEnd(gVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) tVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i3 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) tVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(tVar.getContext());
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
                z = false;
            }
        }
        endBatchEdit();
        return z;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i3) {
        int i4 = this.f9178b;
        V0.e eVar = this.f9179c;
        if (i3 == 0) {
            eVar.getClass();
            ((o) eVar.f1599b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.unspecified"), null);
            return true;
        }
        if (i3 == 1) {
            eVar.getClass();
            ((o) eVar.f1599b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.newline"), null);
            return true;
        }
        if (i3 == 2) {
            eVar.getClass();
            ((o) eVar.f1599b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.go"), null);
            return true;
        }
        if (i3 == 3) {
            eVar.getClass();
            ((o) eVar.f1599b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.search"), null);
            return true;
        }
        if (i3 == 4) {
            eVar.getClass();
            ((o) eVar.f1599b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.send"), null);
            return true;
        }
        if (i3 == 5) {
            eVar.getClass();
            ((o) eVar.f1599b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.next"), null);
            return true;
        }
        if (i3 != 7) {
            eVar.getClass();
            ((o) eVar.f1599b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.done"), null);
            return true;
        }
        eVar.getClass();
        ((o) eVar.f1599b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.previous"), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        V0.e eVar = this.f9179c;
        eVar.getClass();
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
        ((o) eVar.f1599b).a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f9178b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i3) {
        if ((i3 & 1) != 0) {
            this.f9185j.updateCursorAnchorInfo(this.f9177a, b());
        }
        this.f9182g = (i3 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f9188m.G(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i3) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i3) : super.setComposingText(charSequence, i3);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i3, int i4) {
        beginBatchEdit();
        boolean selection = super.setSelection(i3, i4);
        endBatchEdit();
        return selection;
    }
}
