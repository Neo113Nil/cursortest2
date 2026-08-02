package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0.e f9202a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f9203b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f9204c;

    /* renamed from: d, reason: collision with root package name */
    public O1.j f9205d;

    public h(TextServicesManager textServicesManager, C0.e eVar) {
        this.f9203b = textServicesManager;
        this.f9202a = eVar;
        eVar.f201b = this;
    }

    public final void a(String str, String str2, O1.j jVar) {
        if (this.f9205d != null) {
            jVar.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f9205d = jVar;
        Locale a3 = Q1.a.a(str);
        if (this.f9204c == null) {
            this.f9204c = this.f9203b.newSpellCheckerSession(null, a3, this, true);
        }
        this.f9204c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f9205d.success(new ArrayList());
            this.f9205d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f9205d.success(new ArrayList());
            this.f9205d = null;
            return;
        }
        for (int i3 = 0; i3 < sentenceSuggestionsInfo.getSuggestionsCount(); i3++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i3);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i3);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i3) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z = false;
                for (int i4 = 0; i4 < suggestionsCount; i4++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i4);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z = true;
                    }
                }
                if (z) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f9205d.success(arrayList);
        this.f9205d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
