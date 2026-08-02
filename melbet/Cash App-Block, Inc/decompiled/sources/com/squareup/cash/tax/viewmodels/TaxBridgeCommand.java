package com.squareup.cash.tax.viewmodels;

import com.squareup.cash.tax.primitives.Id;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TaxBridgeCommand {

    public final class MenuItemTapCommand implements TaxBridgeCommand {
        public final Id taxMenuItem;

        public MenuItemTapCommand(Id id) {
            id.getClass();
            this.taxMenuItem = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MenuItemTapCommand) && Intrinsics.areEqual(this.taxMenuItem, ((MenuItemTapCommand) obj).taxMenuItem);
        }

        public final int hashCode() {
            return this.taxMenuItem.hashCode();
        }

        public final String toString() {
            return "MenuItemTapCommand(taxMenuItem=" + this.taxMenuItem + ")";
        }
    }

    public interface TaxWebAppCommand extends TaxBridgeCommand {

        public final class BackButtonTapCommand implements TaxWebAppCommand {
            public static final BackButtonTapCommand INSTANCE = new BackButtonTapCommand();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BackButtonTapCommand);
            }

            public final int hashCode() {
                return 206590575;
            }

            public final String toString() {
                return "BackButtonTapCommand";
            }
        }

        public final class CloseButtonTapCommand implements TaxWebAppCommand {
            public static final CloseButtonTapCommand INSTANCE = new CloseButtonTapCommand();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseButtonTapCommand);
            }

            public final int hashCode() {
                return -1643661724;
            }

            public final String toString() {
                return "CloseButtonTapCommand";
            }
        }

        public final class DesktopButtonTapCommand implements TaxWebAppCommand {
            public static final DesktopButtonTapCommand INSTANCE = new DesktopButtonTapCommand();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DesktopButtonTapCommand);
            }

            public final int hashCode() {
                return -446000120;
            }

            public final String toString() {
                return "DesktopButtonTapCommand";
            }
        }

        public final class DialogSubmitRequest implements TaxWebAppCommand {
            public final String id;

            public DialogSubmitRequest(String str) {
                str.getClass();
                this.id = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DialogSubmitRequest) && Intrinsics.areEqual(this.id, ((DialogSubmitRequest) obj).id);
            }

            public final int hashCode() {
                return this.id.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DialogSubmitRequest(id=", this.id, ")");
            }
        }

        public final class HelpButtonTapCommand implements TaxWebAppCommand {
            public static final HelpButtonTapCommand INSTANCE = new HelpButtonTapCommand();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof HelpButtonTapCommand);
            }

            public final int hashCode() {
                return 758589641;
            }

            public final String toString() {
                return "HelpButtonTapCommand";
            }
        }

        public final class MenuButtonTapCommand implements TaxWebAppCommand {
            public static final MenuButtonTapCommand INSTANCE = new MenuButtonTapCommand();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof MenuButtonTapCommand);
            }

            public final int hashCode() {
                return -808095001;
            }

            public final String toString() {
                return "MenuButtonTapCommand";
            }
        }
    }
}
