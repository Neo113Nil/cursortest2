package io.flutter.plugin.editing;

import N3.j;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final J1.c f4521a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f4522b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f4523c;

    /* renamed from: d, reason: collision with root package name */
    public j f4524d;

    public g(TextServicesManager textServicesManager, J1.c cVar) {
        this.f4522b = textServicesManager;
        this.f4521a = cVar;
        cVar.f1289g = this;
    }

    public final void a(String str, String str2, j jVar) {
        if (this.f4524d != null) {
            jVar.a("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f4524d = jVar;
        Locale a7 = P3.a.a(str);
        if (this.f4523c == null) {
            this.f4523c = this.f4522b.newSpellCheckerSession(null, a7, this, true);
        }
        this.f4523c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f4524d.d(new ArrayList());
            this.f4524d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f4524d.d(new ArrayList());
            this.f4524d = null;
            return;
        }
        for (int i7 = 0; i7 < sentenceSuggestionsInfo.getSuggestionsCount(); i7++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i7);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i7);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i7) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z5 = false;
                for (int i8 = 0; i8 < suggestionsCount; i8++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i8);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z5 = true;
                    }
                }
                if (z5) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f4524d.d(arrayList);
        this.f4524d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
