package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.Locale;
import l5.n;
import m5.k;

/* loaded from: classes.dex */
public class d implements n.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    private final n f17295a;

    /* renamed from: b, reason: collision with root package name */
    private final TextServicesManager f17296b;

    /* renamed from: c, reason: collision with root package name */
    private SpellCheckerSession f17297c;

    /* renamed from: d, reason: collision with root package name */
    k.d f17298d;

    public d(TextServicesManager textServicesManager, n nVar) {
        this.f17296b = textServicesManager;
        this.f17295a = nVar;
        nVar.b(this);
    }

    @Override // l5.n.b
    public void a(String str, String str2, k.d dVar) {
        if (this.f17298d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
        } else {
            this.f17298d = dVar;
            c(str, str2);
        }
    }

    public void b() {
        this.f17295a.b(null);
        SpellCheckerSession spellCheckerSession = this.f17297c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        str.split("-");
        Locale b7 = n5.a.b(str);
        if (this.f17297c == null) {
            this.f17297c = this.f17296b.newSpellCheckerSession(null, b7, this, true);
        }
        this.f17297c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        k.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f17298d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            for (int i7 = 0; i7 < sentenceSuggestionsInfo.getSuggestionsCount(); i7++) {
                SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i7);
                int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                if (suggestionsCount > 0) {
                    int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i7);
                    int lengthAt = (sentenceSuggestionsInfo.getLengthAt(i7) + offsetAt) - 1;
                    String str = ("" + String.valueOf(offsetAt) + ".") + String.valueOf(lengthAt) + ".";
                    for (int i8 = 0; i8 < suggestionsCount; i8++) {
                        str = str + suggestionsInfoAt.getSuggestionAt(i8) + "\n";
                    }
                    arrayList.add(str.substring(0, str.length() - 1));
                }
            }
            dVar = this.f17298d;
        }
        dVar.a(arrayList);
        this.f17298d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
