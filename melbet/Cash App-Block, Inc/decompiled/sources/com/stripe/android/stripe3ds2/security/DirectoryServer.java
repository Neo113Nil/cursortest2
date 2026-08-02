package com.stripe.android.stripe3ds2.security;

import com.netcetera.threeds.sdk.api.utils.DsRidValues;
import com.nimbusds.jose.jwk.KeyUse;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DirectoryServer {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ DirectoryServer[] $VALUES;
    public final List ids;
    public final KeyUse keyUse;

    static {
        List listOf = CollectionsKt__CollectionsJVMKt.listOf("F055545342");
        Algorithm[] algorithmArr = Algorithm.$VALUES;
        DirectoryServer directoryServer = new DirectoryServer("TestRsa", listOf, 0);
        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf("F155545342");
        Algorithm[] algorithmArr2 = Algorithm.$VALUES;
        DirectoryServer[] directoryServerArr = {directoryServer, new DirectoryServer("TestEc", listOf2, 1), new DirectoryServer("Visa", CollectionsKt__CollectionsJVMKt.listOf(DsRidValues.VISA), 2), new DirectoryServer("Mastercard", CollectionsKt__CollectionsJVMKt.listOf(DsRidValues.MASTERCARD), 3), new DirectoryServer("Amex", CollectionsKt__CollectionsJVMKt.listOf(DsRidValues.AMEX), 4), new DirectoryServer("Discover", 5, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{DsRidValues.DINERS, "A000000324"}), null), new DirectoryServer("CartesBancaires", CollectionsKt__CollectionsJVMKt.listOf(DsRidValues.CB), 6)};
        $VALUES = directoryServerArr;
        $ENTRIES = new EnumEntriesList(directoryServerArr);
        ArraysKt___ArraysKt.toSet(new String[]{".crt", ".cer", ".pem"});
    }

    public DirectoryServer(String str, int i, List list, KeyUse keyUse) {
        this.ids = list;
        this.keyUse = keyUse;
    }

    public static DirectoryServer valueOf(String str) {
        return (DirectoryServer) Enum.valueOf(DirectoryServer.class, str);
    }

    public static DirectoryServer[] values() {
        return (DirectoryServer[]) $VALUES.clone();
    }

    public /* synthetic */ DirectoryServer(String str, List list, int i) {
        this(str, i, list, KeyUse.SIGNATURE);
    }
}
