package com.my.lib.data;

import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class Agent {
    private final int code;
    private final Data data;
    private final String message;

    public static final class Data {
        private final List<AiSmart> aismartList;

        public static final class AiSmart {
            private final String aismartCode;
            private final int asType;
            private final int authorizedUser;
            private final String avatarUrl;
            private final String creator;
            private final String fileSize;
            private final String fileType;
            private final int homepage;
            private final String imgSize;
            private final String imgType;
            private final int inputFile;
            private final int inputImg;
            private final int inputText;
            private final String name;
            private final String presetGreet;
            private final List<String> presetQuiz;
            private final String role;
            private final int usageCount;

            public AiSmart(String name, String aismartCode, int i8, int i9, String avatarUrl, String creator, String fileSize, String fileType, int i10, int i11, int i12, String presetGreet, List<String> presetQuiz, String role, int i13, int i14, String imgSize, String imgType) {
                s.checkNotNullParameter(name, "name");
                s.checkNotNullParameter(aismartCode, "aismartCode");
                s.checkNotNullParameter(avatarUrl, "avatarUrl");
                s.checkNotNullParameter(creator, "creator");
                s.checkNotNullParameter(fileSize, "fileSize");
                s.checkNotNullParameter(fileType, "fileType");
                s.checkNotNullParameter(presetGreet, "presetGreet");
                s.checkNotNullParameter(presetQuiz, "presetQuiz");
                s.checkNotNullParameter(role, "role");
                s.checkNotNullParameter(imgSize, "imgSize");
                s.checkNotNullParameter(imgType, "imgType");
                this.name = name;
                this.aismartCode = aismartCode;
                this.asType = i8;
                this.authorizedUser = i9;
                this.avatarUrl = avatarUrl;
                this.creator = creator;
                this.fileSize = fileSize;
                this.fileType = fileType;
                this.inputFile = i10;
                this.inputImg = i11;
                this.inputText = i12;
                this.presetGreet = presetGreet;
                this.presetQuiz = presetQuiz;
                this.role = role;
                this.usageCount = i13;
                this.homepage = i14;
                this.imgSize = imgSize;
                this.imgType = imgType;
            }

            public final String component1() {
                return this.name;
            }

            public final int component10() {
                return this.inputImg;
            }

            public final int component11() {
                return this.inputText;
            }

            public final String component12() {
                return this.presetGreet;
            }

            public final List<String> component13() {
                return this.presetQuiz;
            }

            public final String component14() {
                return this.role;
            }

            public final int component15() {
                return this.usageCount;
            }

            public final int component16() {
                return this.homepage;
            }

            public final String component17() {
                return this.imgSize;
            }

            public final String component18() {
                return this.imgType;
            }

            public final String component2() {
                return this.aismartCode;
            }

            public final int component3() {
                return this.asType;
            }

            public final int component4() {
                return this.authorizedUser;
            }

            public final String component5() {
                return this.avatarUrl;
            }

            public final String component6() {
                return this.creator;
            }

            public final String component7() {
                return this.fileSize;
            }

            public final String component8() {
                return this.fileType;
            }

            public final int component9() {
                return this.inputFile;
            }

            public final AiSmart copy(String name, String aismartCode, int i8, int i9, String avatarUrl, String creator, String fileSize, String fileType, int i10, int i11, int i12, String presetGreet, List<String> presetQuiz, String role, int i13, int i14, String imgSize, String imgType) {
                s.checkNotNullParameter(name, "name");
                s.checkNotNullParameter(aismartCode, "aismartCode");
                s.checkNotNullParameter(avatarUrl, "avatarUrl");
                s.checkNotNullParameter(creator, "creator");
                s.checkNotNullParameter(fileSize, "fileSize");
                s.checkNotNullParameter(fileType, "fileType");
                s.checkNotNullParameter(presetGreet, "presetGreet");
                s.checkNotNullParameter(presetQuiz, "presetQuiz");
                s.checkNotNullParameter(role, "role");
                s.checkNotNullParameter(imgSize, "imgSize");
                s.checkNotNullParameter(imgType, "imgType");
                return new AiSmart(name, aismartCode, i8, i9, avatarUrl, creator, fileSize, fileType, i10, i11, i12, presetGreet, presetQuiz, role, i13, i14, imgSize, imgType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AiSmart)) {
                    return false;
                }
                AiSmart aiSmart = (AiSmart) obj;
                return s.areEqual(this.name, aiSmart.name) && s.areEqual(this.aismartCode, aiSmart.aismartCode) && this.asType == aiSmart.asType && this.authorizedUser == aiSmart.authorizedUser && s.areEqual(this.avatarUrl, aiSmart.avatarUrl) && s.areEqual(this.creator, aiSmart.creator) && s.areEqual(this.fileSize, aiSmart.fileSize) && s.areEqual(this.fileType, aiSmart.fileType) && this.inputFile == aiSmart.inputFile && this.inputImg == aiSmart.inputImg && this.inputText == aiSmart.inputText && s.areEqual(this.presetGreet, aiSmart.presetGreet) && s.areEqual(this.presetQuiz, aiSmart.presetQuiz) && s.areEqual(this.role, aiSmart.role) && this.usageCount == aiSmart.usageCount && this.homepage == aiSmart.homepage && s.areEqual(this.imgSize, aiSmart.imgSize) && s.areEqual(this.imgType, aiSmart.imgType);
            }

            public final String getAismartCode() {
                return this.aismartCode;
            }

            public final int getAsType() {
                return this.asType;
            }

            public final int getAuthorizedUser() {
                return this.authorizedUser;
            }

            public final String getAvatarUrl() {
                return this.avatarUrl;
            }

            public final String getCreator() {
                return this.creator;
            }

            public final String getFileSize() {
                return this.fileSize;
            }

            public final String getFileType() {
                return this.fileType;
            }

            public final int getHomepage() {
                return this.homepage;
            }

            public final String getImgSize() {
                return this.imgSize;
            }

            public final String getImgType() {
                return this.imgType;
            }

            public final int getInputFile() {
                return this.inputFile;
            }

            public final int getInputImg() {
                return this.inputImg;
            }

            public final int getInputText() {
                return this.inputText;
            }

            public final String getName() {
                return this.name;
            }

            public final String getPresetGreet() {
                return this.presetGreet;
            }

            public final List<String> getPresetQuiz() {
                return this.presetQuiz;
            }

            public final String getRole() {
                return this.role;
            }

            public final int getUsageCount() {
                return this.usageCount;
            }

            public int hashCode() {
                return this.imgType.hashCode() + ((this.imgSize.hashCode() + ((this.homepage + ((this.usageCount + ((this.role.hashCode() + ((this.presetQuiz.hashCode() + ((this.presetGreet.hashCode() + ((this.inputText + ((this.inputImg + ((this.inputFile + ((this.fileType.hashCode() + ((this.fileSize.hashCode() + ((this.creator.hashCode() + ((this.avatarUrl.hashCode() + ((this.authorizedUser + ((this.asType + ((this.aismartCode.hashCode() + (this.name.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
            }

            public String toString() {
                return "AiSmart(name=" + this.name + ", aismartCode=" + this.aismartCode + ", asType=" + this.asType + ", authorizedUser=" + this.authorizedUser + ", avatarUrl=" + this.avatarUrl + ", creator=" + this.creator + ", fileSize=" + this.fileSize + ", fileType=" + this.fileType + ", inputFile=" + this.inputFile + ", inputImg=" + this.inputImg + ", inputText=" + this.inputText + ", presetGreet=" + this.presetGreet + ", presetQuiz=" + this.presetQuiz + ", role=" + this.role + ", usageCount=" + this.usageCount + ", homepage=" + this.homepage + ", imgSize=" + this.imgSize + ", imgType=" + this.imgType + ")";
            }
        }

        public Data(List<AiSmart> aismartList) {
            s.checkNotNullParameter(aismartList, "aismartList");
            this.aismartList = aismartList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                list = data.aismartList;
            }
            return data.copy(list);
        }

        public final List<AiSmart> component1() {
            return this.aismartList;
        }

        public final Data copy(List<AiSmart> aismartList) {
            s.checkNotNullParameter(aismartList, "aismartList");
            return new Data(aismartList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && s.areEqual(this.aismartList, ((Data) obj).aismartList);
        }

        public final List<AiSmart> getAismartList() {
            return this.aismartList;
        }

        public int hashCode() {
            return this.aismartList.hashCode();
        }

        public String toString() {
            return "Data(aismartList=" + this.aismartList + ")";
        }
    }

    public Agent(int i8, Data data, String message) {
        s.checkNotNullParameter(data, "data");
        s.checkNotNullParameter(message, "message");
        this.code = i8;
        this.data = data;
        this.message = message;
    }

    public static /* synthetic */ Agent copy$default(Agent agent, int i8, Data data, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = agent.code;
        }
        if ((i9 & 2) != 0) {
            data = agent.data;
        }
        if ((i9 & 4) != 0) {
            str = agent.message;
        }
        return agent.copy(i8, data, str);
    }

    public final int component1() {
        return this.code;
    }

    public final Data component2() {
        return this.data;
    }

    public final String component3() {
        return this.message;
    }

    public final Agent copy(int i8, Data data, String message) {
        s.checkNotNullParameter(data, "data");
        s.checkNotNullParameter(message, "message");
        return new Agent(i8, data, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Agent)) {
            return false;
        }
        Agent agent = (Agent) obj;
        return this.code == agent.code && s.areEqual(this.data, agent.data) && s.areEqual(this.message, agent.message);
    }

    public final int getCode() {
        return this.code;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + ((this.data.hashCode() + (this.code * 31)) * 31);
    }

    public String toString() {
        return "Agent(code=" + this.code + ", data=" + this.data + ", message=" + this.message + ")";
    }
}
