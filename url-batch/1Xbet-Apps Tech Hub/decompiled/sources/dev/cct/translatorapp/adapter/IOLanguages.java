package dev.cct.translatorapp.adapter;

import dev.cct.translatorapp.LanguageListModel;
import kotlin.Metadata;

/* compiled from: LangSelAdapter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Ldev/cct/translatorapp/adapter/IOLanguages;", "", "setConInputLang", "", "pos", "", "itemsViewModel", "Ldev/cct/translatorapp/LanguageListModel;", "setConOutputLang", "setInputLang", "setOutputLang", "setPhInputLang", "setPhOutputLang", "setSpeechLang", "setWidgetInputLang", "setWidgetOutputLang", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IOLanguages {
    void setConInputLang(int pos, LanguageListModel itemsViewModel);

    void setConOutputLang(int pos, LanguageListModel itemsViewModel);

    void setInputLang(int pos, LanguageListModel itemsViewModel);

    void setOutputLang(int pos, LanguageListModel itemsViewModel);

    void setPhInputLang(int pos, LanguageListModel itemsViewModel);

    void setPhOutputLang(int pos, LanguageListModel itemsViewModel);

    void setSpeechLang(int pos, LanguageListModel itemsViewModel);

    void setWidgetInputLang(int pos, LanguageListModel itemsViewModel);

    void setWidgetOutputLang(int pos, LanguageListModel itemsViewModel);
}
