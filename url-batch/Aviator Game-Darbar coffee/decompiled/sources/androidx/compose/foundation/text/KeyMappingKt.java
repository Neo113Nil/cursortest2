package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: KeyMapping.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"commonKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "defaultKeyMapping", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1202mapZmokQxo(android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m5878boximpl(event)).booleanValue() && KeyEvent_androidKt.m5901isShiftPressedZmokQxo(event)) {
                    if (Key.m5587equalsimpl0(KeyEvent_androidKt.m5895getKeyZmokQxo(event), Key.INSTANCE.m5873getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m5878boximpl(event)).booleanValue()) {
                    long m5895getKeyZmokQxo = KeyEvent_androidKt.m5895getKeyZmokQxo(event);
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5641getCEK5gGoQ()) || Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5705getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5862getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5870getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5591getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5871getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5873getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m5899isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m5901isShiftPressedZmokQxo(event)) {
                    long m5895getKeyZmokQxo2 = KeyEvent_androidKt.m5895getKeyZmokQxo(event);
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5663getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5664getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5665getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5660getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5776getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5775getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5739getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5738getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5705getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long m5895getKeyZmokQxo3 = KeyEvent_androidKt.m5895getKeyZmokQxo(event);
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5663getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5664getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5665getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5660getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5659getDirectionCenterEK5gGoQ())) {
                    return KeyCommand.CENTER;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5776getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5775getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5739getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5738getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5673getEnterEK5gGoQ()) || Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5765getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5604getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5658getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5778getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5656getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5653getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5823getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m5899isCtrlPressedZmokQxo(((KeyEvent) obj).m5884unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1202mapZmokQxo(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m5901isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m5899isCtrlPressedZmokQxo(event)) {
                    long m5895getKeyZmokQxo = KeyEvent_androidKt.m5895getKeyZmokQxo(event);
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5663getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5664getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5665getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo, Key.INSTANCE.m5660getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m5899isCtrlPressedZmokQxo(event)) {
                    long m5895getKeyZmokQxo2 = KeyEvent_androidKt.m5895getKeyZmokQxo(event);
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5663getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5664getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5665getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5660getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5698getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5658getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5604getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo2, Key.INSTANCE.m5603getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m5901isShiftPressedZmokQxo(event)) {
                    long m5895getKeyZmokQxo3 = KeyEvent_androidKt.m5895getKeyZmokQxo(event);
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5739getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo3, Key.INSTANCE.m5738getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m5898isAltPressedZmokQxo(event)) {
                    long m5895getKeyZmokQxo4 = KeyEvent_androidKt.m5895getKeyZmokQxo(event);
                    if (Key.m5587equalsimpl0(m5895getKeyZmokQxo4, Key.INSTANCE.m5604getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m5587equalsimpl0(m5895getKeyZmokQxo4, Key.INSTANCE.m5658getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? KeyMapping.this.mo1202mapZmokQxo(event) : keyCommand;
            }
        };
    }
}
