package com.yandex.div.storage;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.util.SqlExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivStorageImpl$readStateFor$1 extends s implements Function0<Unit> {
    final /* synthetic */ DatabaseOpenHelper.Database $db;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStorageImpl$readStateFor$1(DatabaseOpenHelper.Database database) {
        super(0);
        this.$db = database;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m233invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m233invoke() {
        SqlExtensionsKt.closeSilently(this.$db);
    }
}
