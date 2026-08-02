package com.squareup.cash.transfers.viewmodels;

/* loaded from: classes7.dex */
public interface InstrumentDetailsViewEvent {

    public final class Cancel implements InstrumentDetailsViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 805720167;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Remove implements InstrumentDetailsViewEvent {
        public static final Remove INSTANCE = new Remove();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Remove);
        }

        public final int hashCode() {
            return 1238833777;
        }

        public final String toString() {
            return "Remove";
        }
    }

    public final class Replace implements InstrumentDetailsViewEvent {
        public static final Replace INSTANCE = new Replace();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Replace);
        }

        public final int hashCode() {
            return -248197529;
        }

        public final String toString() {
            return "Replace";
        }
    }

    public final class SetDefault implements InstrumentDetailsViewEvent {
        public static final SetDefault INSTANCE = new SetDefault();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SetDefault);
        }

        public final int hashCode() {
            return -957234452;
        }

        public final String toString() {
            return "SetDefault";
        }
    }
}
