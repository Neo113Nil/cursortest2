package kotlinx.serialization;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MissingFieldException extends SerializationException {
    public final List missingFields;
    public final String serialName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingFieldException(String str, ArrayList arrayList) {
        this(r0, null, arrayList, str);
        String str2;
        str.getClass();
        if (arrayList.size() == 1) {
            str2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
    }

    public MissingFieldException(String str, MissingFieldException missingFieldException, List list, String str2) {
        super(str, missingFieldException);
        this.missingFields = list;
        this.serialName = str2;
    }
}
