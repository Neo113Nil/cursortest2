package com.squareup.cash.work.presenters.pay;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PayHistoryListPresenter$DataState {

    public final class Error implements PayHistoryListPresenter$DataState {
        public static final Error INSTANCE = new Error();
    }

    public final class Loaded implements PayHistoryListPresenter$DataState {
        public final boolean isLoadingMore;
        public final Integer nextOffset;
        public final List stubs;

        public Loaded(List list, Integer num, boolean z) {
            this.stubs = list;
            this.nextOffset = num;
            this.isLoadingMore = z;
        }

        public static Loaded copy$default(Loaded loaded, boolean z) {
            List list = loaded.stubs;
            Integer num = loaded.nextOffset;
            loaded.getClass();
            return new Loaded(list, num, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.stubs.equals(loaded.stubs) && Intrinsics.areEqual(this.nextOffset, loaded.nextOffset) && this.isLoadingMore == loaded.isLoadingMore;
        }

        public final int hashCode() {
            int hashCode = this.stubs.hashCode() * 31;
            Integer num = this.nextOffset;
            return Boolean.hashCode(this.isLoadingMore) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(stubs=");
            sb.append(this.stubs);
            sb.append(", nextOffset=");
            sb.append(this.nextOffset);
            sb.append(", isLoadingMore=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isLoadingMore, ")");
        }
    }

    public final class Loading implements PayHistoryListPresenter$DataState {
        public static final Loading INSTANCE = new Loading();
    }
}
