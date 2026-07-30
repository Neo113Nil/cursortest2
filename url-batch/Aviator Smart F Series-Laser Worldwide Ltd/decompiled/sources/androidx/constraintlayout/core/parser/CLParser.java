package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParser {
    static boolean sDebug = false;
    private String mContent;
    private boolean mHasComment = false;
    private int mLineNumber;

    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i8, TYPE type, boolean z7, char[] cArr) {
        CLElement allocate;
        if (sDebug) {
            System.out.println("CREATE " + type + " at " + cArr[i8]);
        }
        switch (type.ordinal()) {
            case 1:
                allocate = CLObject.allocate(cArr);
                i8++;
                break;
            case 2:
                allocate = CLArray.allocate(cArr);
                i8++;
                break;
            case 3:
                allocate = CLNumber.allocate(cArr);
                break;
            case 4:
                allocate = CLString.allocate(cArr);
                break;
            case 5:
                allocate = CLKey.allocate(cArr);
                break;
            case 6:
                allocate = CLToken.allocate(cArr);
                break;
            default:
                allocate = null;
                break;
        }
        if (allocate == null) {
            return null;
        }
        allocate.setLine(this.mLineNumber);
        if (z7) {
            allocate.setStart(i8);
        }
        if (cLElement instanceof CLContainer) {
            allocate.setContainer((CLContainer) cLElement);
        }
        return allocate;
    }

    private CLElement getNextJsonElement(int i8, char c8, CLElement cLElement, char[] cArr) {
        if (c8 == '\t' || c8 == '\n' || c8 == '\r' || c8 == ' ') {
            return cLElement;
        }
        if (c8 == '\"' || c8 == '\'') {
            return cLElement instanceof CLObject ? createElement(cLElement, i8, TYPE.KEY, true, cArr) : createElement(cLElement, i8, TYPE.STRING, true, cArr);
        }
        if (c8 == '[') {
            return createElement(cLElement, i8, TYPE.ARRAY, true, cArr);
        }
        if (c8 != ']') {
            if (c8 == '{') {
                return createElement(cLElement, i8, TYPE.OBJECT, true, cArr);
            }
            if (c8 != '}') {
                switch (c8) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return createElement(cLElement, i8, TYPE.NUMBER, true, cArr);
                    case ',':
                    case ':':
                        return cLElement;
                    case '/':
                        int i9 = i8 + 1;
                        if (i9 >= cArr.length || cArr[i9] != '/') {
                            return cLElement;
                        }
                        this.mHasComment = true;
                        return cLElement;
                    default:
                        if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                            return createElement(cLElement, i8, TYPE.KEY, true, cArr);
                        }
                        CLElement createElement = createElement(cLElement, i8, TYPE.TOKEN, true, cArr);
                        CLToken cLToken = (CLToken) createElement;
                        if (cLToken.validate(c8, i8)) {
                            return createElement;
                        }
                        throw new CLParsingException("incorrect token <" + c8 + "> at line " + this.mLineNumber, cLToken);
                }
            }
        }
        cLElement.setEnd(i8 - 1);
        CLElement container = cLElement.getContainer();
        container.setEnd(i8);
        return container;
    }

    public static CLObject parse(String str) {
        return new CLParser(str).parse();
    }

    public CLObject parse() {
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i8 = 1;
        this.mLineNumber = 1;
        boolean z7 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                i9 = -1;
                break;
            }
            char c8 = charArray[i9];
            if (c8 == '{') {
                break;
            }
            if (c8 == '\n') {
                this.mLineNumber++;
            }
            i9++;
        }
        if (i9 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject allocate = CLObject.allocate(charArray);
        allocate.setLine(this.mLineNumber);
        allocate.setStart(i9);
        int i10 = i9 + 1;
        CLElement cLElement = allocate;
        while (i10 < length) {
            char c9 = charArray[i10];
            if (c9 == '\n') {
                this.mLineNumber += i8;
            }
            if (this.mHasComment) {
                if (c9 == '\n') {
                    this.mHasComment = z7;
                } else {
                    continue;
                    i10++;
                    i8 = 1;
                    z7 = false;
                }
            }
            if (cLElement == null) {
                break;
            }
            if (cLElement.isDone()) {
                cLElement = getNextJsonElement(i10, c9, cLElement, charArray);
            } else if (cLElement instanceof CLObject) {
                if (c9 == '}') {
                    cLElement.setEnd(i10 - 1);
                } else {
                    cLElement = getNextJsonElement(i10, c9, cLElement, charArray);
                }
            } else if (!(cLElement instanceof CLArray)) {
                boolean z8 = cLElement instanceof CLString;
                if (z8) {
                    long j8 = cLElement.mStart;
                    if (charArray[(int) j8] == c9) {
                        cLElement.setStart(j8 + 1);
                        cLElement.setEnd(i10 - 1);
                    }
                } else {
                    if (cLElement instanceof CLToken) {
                        CLToken cLToken = (CLToken) cLElement;
                        if (!cLToken.validate(c9, i10)) {
                            throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.mLineNumber, cLToken);
                        }
                    }
                    if ((cLElement instanceof CLKey) || z8) {
                        long j9 = cLElement.mStart;
                        char c10 = charArray[(int) j9];
                        if ((c10 == '\'' || c10 == '\"') && c10 == c9) {
                            cLElement.setStart(j9 + 1);
                            cLElement.setEnd(i10 - 1);
                        }
                    }
                    if (!cLElement.isDone() && (c9 == '}' || c9 == ']' || c9 == ',' || c9 == ' ' || c9 == '\t' || c9 == '\r' || c9 == '\n' || c9 == ':')) {
                        long j10 = i10 - 1;
                        cLElement.setEnd(j10);
                        if (c9 == '}' || c9 == ']') {
                            cLElement = cLElement.getContainer();
                            cLElement.setEnd(j10);
                            if (cLElement instanceof CLKey) {
                                cLElement = cLElement.getContainer();
                                cLElement.setEnd(j10);
                            }
                        }
                    }
                }
            } else if (c9 == ']') {
                cLElement.setEnd(i10 - 1);
            } else {
                cLElement = getNextJsonElement(i10, c9, cLElement, charArray);
            }
            if (cLElement.isDone() && (!(cLElement instanceof CLKey) || ((CLKey) cLElement).mElements.size() > 0)) {
                cLElement = cLElement.getContainer();
            }
            i10++;
            i8 = 1;
            z7 = false;
        }
        while (cLElement != null && !cLElement.isDone()) {
            if (cLElement instanceof CLString) {
                cLElement.setStart(((int) cLElement.mStart) + 1);
            }
            cLElement.setEnd(length - 1);
            cLElement = cLElement.getContainer();
        }
        if (sDebug) {
            System.out.println("Root: " + allocate.toJSON());
        }
        return allocate;
    }
}
