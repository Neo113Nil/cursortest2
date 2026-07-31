package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import o0.C0211b;
import w0.C0248b;

/* loaded from: classes.dex */
public final class h implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0211b f2424a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f2425b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f2426c;

    /* renamed from: d, reason: collision with root package name */
    public u0.k f2427d;

    public h(TextServicesManager textServicesManager, C0211b c0211b) {
        this.f2425b = textServicesManager;
        this.f2424a = c0211b;
        c0211b.f2915f = this;
    }

    public final void a(String str, String str2, u0.k kVar) {
        if (this.f2427d != null) {
            kVar.a("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f2427d = kVar;
        Locale a2 = C0248b.a(str);
        if (this.f2426c == null) {
            this.f2426c = this.f2425b.newSpellCheckerSession(null, a2, this, true);
        }
        this.f2426c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f2427d.d(new ArrayList());
            this.f2427d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f2427d.d(new ArrayList());
            this.f2427d = null;
            return;
        }
        for (int i2 = 0; i2 < sentenceSuggestionsInfo.getSuggestionsCount(); i2++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i2);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i2);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i2) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (int i3 = 0; i3 < suggestionsCount; i3++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i3);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z2 = true;
                    }
                }
                if (z2) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f2427d.d(arrayList);
        this.f2427d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
