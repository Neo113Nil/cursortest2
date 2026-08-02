package sqip.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lsqip/internal/ReadableCardEditor;", "", "getCardNumber", "", "getCvv", "getMonth", "", "getPostal", "getYear", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ReadableCardEditor {
    String getCardNumber();

    String getCvv();

    int getMonth();

    String getPostal();

    int getYear();
}
